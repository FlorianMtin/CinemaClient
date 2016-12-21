<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@include file="include/header.jsp" %>
<!-- CONTENT -->
			<div id="content">
				<div class="line-hor"></div>
				<div class="content">
					<h3>Fresh <span>Movies</span></h3>
					<ul class="movies">
						<c:forEach items="${mesFilms}" var="film">
						<li>
							<h4>${film.Titre}</h4><img src="images/1page-img2.jpg" alt="" />
							<div class="wrapper"><a href="Controleur?action=unFilm" method="post"  name="id" value="${film.NoFilm}"  class="link2" ><span><span>Read More</span></span></a></div>
						</li>
						</c:forEach>
						<li class="clear">&nbsp;</li>

					</ul>
				</div>
			</div>
<!-- FOOTER -->

<%@include file="include/footer.jsp" %>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>