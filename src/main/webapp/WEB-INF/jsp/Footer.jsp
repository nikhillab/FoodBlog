
<!-- Footer section  -->
<footer class="footer-section set-bg" data-setbg="${pageContext.request.contextPath}public/img/footer-bg.jpg">
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-6">
				<div class="footer-logo">
					<img src="${pageContext.request.contextPath}/public/asserts/logo.PNG"
						alt="" height="150" width="300">
				</div>
				<div class="footer-social">
					<a href="#"><i class="fa fa-pinterest"></i></a> <a href="#"><i
						class="fa fa-facebook"></i></a> <a href="#"><i
						class="fa fa-twitter"></i></a> <a href="#"><i
						class="fa fa-dribbble"></i></a> <a href="#"><i
						class="fa fa-behance"></i></a> <a href="#"><i
						class="fa fa-linkedin"></i></a>
				</div>
			</div>
			<div class="col-lg-6 text-lg-right">
				<ul class="footer-menu">
					<li><a href="/">Home</a></li>
					<li><a href="#">Features</a></li>
					<li><a href="/recipes?title=Receipies">Receipies</a></li>
					<li><a href="/contact">Contact</a></li>
				</ul>
				<p class="copyright">
					Copyright &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					All rights reserved | This is made with <i
						class="fa fa-heart-o" aria-hidden="true"></i> by <a href=""
						target="_blank">Nikhil</a>
				</p>
			</div>
		</div>
	</div>
</footer>
<!-- Footer section end -->



<!--====== Javascripts & Jquery ======-->
<script
	src="${pageContext.request.contextPath}/public/js/jquery-3.2.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/public/js/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/public/js/main.js"></script>
<script src="${pageContext.request.contextPath}/public/js/bootstrap.min.js"></script>

</body>
</html>