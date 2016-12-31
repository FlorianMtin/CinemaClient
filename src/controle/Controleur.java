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
	private static final String ADDFILM = "addFilm";
	private static final String INSERERFILM = "insererFilm";


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

		else if(ADDFILM.equals(actionName)){
			String ressourceRea = "/Realisateurs";
			Appel unAppel = new Appel();
			reponse = unAppel.appelJson(ressourceRea);
			Gson gson = new Gson();
			List<Realisateur> acts = gson.fromJson(reponse,List.class);
			request.setAttribute("rea",acts);

			String ressourceCate ="/Categories";
			reponse = unAppel.appelJson(ressourceCate);
			List<Categorie> cate = gson.fromJson(reponse,List.class);
			request.setAttribute("cate",cate);

			destinationPage = "/new_film.jsp";

		}
		else if(INSERERFILM.equals(actionName)){
			String name = request.getParameter("nameFilm");
			String duree = request.getParameter("duree");
			String budget = request.getParameter("budget");
			String date = request.getParameter("date");
			String recette = request.getParameter("recette");
			String rea = request.getParameter("choixRea");
			String cate = request.getParameter("choixCate");
			Film unfilm = new Film();
			unfilm.setTitre(name);
			unfilm.setDuree(Integer.parseInt(duree));
			unfilm.setBudget(Integer.parseInt(budget));
			unfilm.setDateSortie(date);
			unfilm.setMontantRecette(Integer.parseInt(recette));
			double d = Double.parseDouble(rea);
			int coderea = (int) d;
			unfilm.setNoRea(coderea);
			unfilm.setCodeCat(cate);
			String ressource = "/Film/Add/" + unfilm;
			Appel unAppel = new Appel();
			reponse = unAppel.postJson(ressource, unfilm);
			destinationPage="/index.jsp";
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(destinationPage);
		dispatcher.forward(request,response);
	}
}

