package controle;

import java.io.Console;
import java.io.Externalizable;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import consommation.Appel;
import metier.*;
import meserreurs.*;

/**
 * Servlet implementation class Controleur
 */
@WebServlet("/Controleur")
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ACTION_TYPE = "action";
	private static final String ERROR_PAGE = "/erreur.jsp";
	private static final String FILMS = "films";
	private static final String FILM = "unFilm";


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controleur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processusTraiteRequete(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 * response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processusTraiteRequete(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void processusTraiteRequete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,Exception{
		String actionName = request.getParameter(ACTION_TYPE);
		String destinationPage = ERROR_PAGE;
		String reponse;

		if(FILMS.equals(actionName)){
			String ressource = "/Films";
			Appel unAppel = new Appel();
			reponse = unAppel.appelJson(ressource);
			Gson gson = new Gson();
			List<Film> json = gson.fromJson(reponse, List.class);
			request.setAttribute("mesFilms",json);

			destinationPage = "/films.jsp";
		}

		else if(FILM.equals(actionName)){

			String id = request.getParameter("NoFilm");

			String ressource ="/Films/" + id;

			Appel unAppel = new Appel();
			reponse = unAppel.appelJson(ressource);
			System.out.println(reponse);
			Gson gson = new Gson();

			Film film = gson.fromJson(reponse,metier.Film.class);


			request.setAttribute("item",film);
			destinationPage = "/film.jsp";
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
		dispatcher.forward(request,response);
	}
}

