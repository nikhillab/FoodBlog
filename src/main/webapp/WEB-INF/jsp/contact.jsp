<!-- Include Head Part -->
<%@include file="Head.jsp"%>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>
	<!-- Include Navbar -->
	<%@include file="Navbar.jsp"%>
	
	
	<section class="contact-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="contact-form-warp">
						<h4>Leave a comment</h4>
						<form class="contact-form">
							<div class="row">
								<div class="col-md-6">
									<input type="text" placeholder="Name">
								</div>
								<div class="col-md-6">
									<input type="text" placeholder="E-mail">
								</div>
								<div class="col-md-12">
									<input type="text" placeholder="Subject">
									<textarea placeholder="Message"></textarea>
									<button class="site-btn">Send</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="contact-logo">
						<img src="${pageContext.request.contextPath}/public/asserts/logo.PNG" alt="Foodzz">
					</div>
					<div class="contact-info">
						<ul class="ct-list">
							<li>
								<h6>Address:</h6>
								<p>481 Creekside Lane Avila</p>
								<p>Beach, IN 93424</p>
							</li>
							<li>
								<h6>Phone:</h6>
								<p>+91 345 7953 324</p>
								<p>+91 345 7557 822</p>
							</li>
							<li>
								<h6>Email:</h6>
								<p>foodzz@gmail.com</p>
							</li>
						</ul>
						<div class="contact-social">
							<a href="#"><i class="fa fa-pinterest"></i></a>
							<a href="#"><i class="fa fa-facebook"></i></a>
							<a href="#"><i class="fa fa-twitter"></i></a>
							<a href="#"><i class="fa fa-dribbble"></i></a>
							<a href="#"><i class="fa fa-behance"></i></a>
							<a href="#"><i class="fa fa-linkedin"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<%@include file="Footer.jsp"%>