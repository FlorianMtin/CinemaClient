<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ include file="include/header.jsp" %>
<!-- CONTENT -->
				<div class="content">
					<div class="line-hor"></div>
						<div class="box">
							<div class="border-right">
								<div class="border-left">
									<div class="inner">

					<h3>Add <span>Film</span></h3>
					<form id="contacts-form" action="">
						<fieldset>
							<div class="field"><label>Nom du film:</label><input type="text" value=""/></div>
						 	<div class="field"><label>Dur&eacute;e en minutes :</label><input type="text" value=""/></div>
							<div class="field"><label>Budget:</label><input type="text" value=""/></div>
							<div class="field"><label>Recette:</label><input type="text" value=""/></div>
							<div class="field"><label>R&eacute;alisateur:</label>
								<SELECT id="choixRea" name="choixRea">
									<Option value=0> CHOISSEZ UN REALISATEUR </Option>
									<c:forEach items="${rea}" var="item">
										<option value="${item.NomRea}">${item.NomAct} ${item.PrenRea}</option>
									</c:forEach>
									<option value=NULL> None </option>
								</SELECT>
							</div>
							<div class="field"><label>Cat&eacute;gorie:</label>
								<SELECT id="choixCate" name="choixCate">
									<Option value=0> CHOISSEZ UNE CATEGORIE  </Option>
									<c:forEach items="${cate}" var="item">
										<option value="${item.CodeCat}">${item.CodeCat} : ${item.LibelleCat}</option>
									</c:forEach>
									<Option value=NULL> None  </Option>

								</SELECT>
							</div>
							<div class="wrapper">
							<a href="#" class="link2" onclick="document.getElementById('contacts-form').submit()">	
								<span>
									<span>Send Your Message</span>
								</span>
							</a>
						</div>
						</fieldset>
					</form>
					</div>
				</div>
							</div>
						</div>
				</div>

<!-- FOOTER -->

<%@ include file="include/footer.jsp" %>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
