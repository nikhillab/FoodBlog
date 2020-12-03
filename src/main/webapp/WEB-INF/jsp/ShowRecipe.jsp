<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Head.jsp"%>
<body>
	<%@include file="Navbar.jsp"%>
	<main>
		<section class="bottom-widgets-section spad">
			<div class="container">
				<div class="section-title">
					<h2>${recipe.getRecipeName()}</h2>
				</div>
				<div id="carouselExampleControls" class="carousel slide"
					data-ride="carousel">

					<div class="carousel-inner">
						<div class="carousel-item active">
							<img
								src="${pageContext.request.contextPath}/uploads/${pictures[0]}"
								class="d-block w-100 " alt="${pictures[0]}"
								height="500" width="400">
						</div>
						<c:forTokens items="${recipe.getRecipePicture()}" delims="," var="image">
						<div class="carousel-item ">
							<img
								src="${pageContext.request.contextPath}/uploads/${image}"
								class="d-block w-100 " alt="${image}"
								height="500" width="400">
						</div>
						</c:forTokens>
					</div>

					<a class="carousel-control-prev" href="#carouselExampleControls"
						role="button" data-slide="prev"> <span
						class="carousel-control-prev-icon" aria-hidden="true"></span> <span
						class="sr-only">Previous</span>
					</a> <a class="carousel-control-next" href="#carouselExampleControls"
						role="button" data-slide="next"> <span
						class="carousel-control-next-icon" aria-hidden="true"></span> <span
						class="sr-only">Next</span>
					</a>
				</div>
				<div class="row">
					<div class="col-lg-12 col-md-6 ftw-warp mt-3">
						<div class="section-title"></div>
						<h5>
							<b>Summary:</b> ${recipe.getRecipeDescription().getSummary()}
						</h5>

						<h5>
							<b>Time:</b> ${recipe.getRecipeDescription().getTime()} Min
						</h5>
						<h5>
							<b>Serves:</b>${recipe.getRecipeDescription().getServes()}</h5>
					</div>

				</div>

				<div class="row">

					<div class="col-lg-4 col-md-6 ftw-warp mt-3">
						<div class="section-title">
							<h3>Inigredients List</h3>
						</div>
						<ul class="sp-recipes-list">
							<li>
								<div class="rl-info">
									<h6>
										<c:forEach var="Inigredients"
											items=" ${recipe.getRecipeInigredientsList()}">
											<h6>${Inigredients}</h6>
										</c:forEach>
									</h6>
									<div class="rating">
										<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star"></i> <i class="fa fa-star"></i> <i
											class="fa fa-star is-fade"></i>
									</div>
								</div>
							</li>

						</ul>
					</div>

					<div class="col-lg-8">
						<div class="sp-blog-item">
							<div class="section-title ">
								<h3 class=" mt-3 pl-3">Description</h3>
							</div>
							<div class="blog-text">
								<h5>${recipe.getRecipeType() }</h5>
								<p>${recipe.getRecipeDescription().getProcess()}</p>

								<a href="#" class="comment">2 Comments</a>
							</div>
							<p class="mt-3 pl-3 pb-3">
								<b>Tags:</b>
								<c:forEach var="tags" items="${recipe.getRecipeTagsList() }">
									<c:out value="${tags}"></c:out>

								</c:forEach>
							</p>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>
	<%@include file="Footer.jsp"%>