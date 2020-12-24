<!-- Include Head Part -->
<%@include file="Head.jsp"%>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>
	<!-- Include Navbar -->
	<%@include file="Navbar.jsp"%>



	<main role="main">
		<!-- Include OfferSlide -->
		<%@include file="Hero.jsp"%>


		<div class="container marketing mt-3">
	
			<hr class="featurette-divider" />
			
			<%@include file="LatestPost.jsp"%>
			<!-- Start of Trending  Three  -->
			<jsp:include page="Trending.jsp"></jsp:include>

			<!-- Include CatagryShow -->
			<jsp:include page="CatogryShow.jsp"></jsp:include>
		</div>
		
	</main>
	<hr>
	<jsp:include page="slider.jsp"></jsp:include>
	<!--  Include  FOOTER hear  -->
	<%@include file="Footer.jsp"%>