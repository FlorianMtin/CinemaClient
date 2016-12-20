<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@include file="include/header.jsp" %>
			<div id="content">
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Our <span>Contacts</span></h3>
								<div class="address">
									<div class="fleft"><span>Zip Code:</span>50122<br />
										<span>Country:</span>USA<br />
										<span>Telephone:</span>+354 5635600<br />
										<span>Fax:</span>+354 5635610</div>
									<div class="extra-wrap"><span>Miscellaneous info:</span><br />
										Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur.</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="content">
					<h3>Contact <span>Form</span></h3>
					<form id="contacts-form" action="">
						<fieldset>
						<div class="field"><label>Your Name:</label><input type="text" value=""/></div>
						<div class="field"><label>Your E-mail:</label><input type="text" value=""/></div>
						<div class="field"><label>Your Website:</label><input type="text" value=""/></div>
						<div class="field"><label>Your Message:</label><textarea cols="1" rows="1"></textarea></div>
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
<!-- FOOTER -->

<%@include file="include/footer.jsp" %>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
