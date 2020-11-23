
<section class="recipes-section spad pt-0">
	<div class="container">
		<div class="section-title">
			<h2>Latest recipes</h2>
		</div>
		<div class="row">
		<c:forEach var="i" begin="0" end="5">
				<div class="col-lg-4 col-md-6">
					<div class="recipe">
						<img
							src="${pageContext.request.contextPath}/public/img/recipes/1.jpg"
							alt="">
						<div class="recipe-info-warp">
							<div class="recipe-info">
								<a href="/c"><h3>Traditional Pizza</h3></a>
								<div class="rating">
									<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star"></i> <i class="fa fa-star"></i> <i
										class="fa fa-star is-fade"></i>
								</div>
							</div>
						</div>
					</div>
				</div>
				</c:forEach>
		</div>
	</div>
</section>