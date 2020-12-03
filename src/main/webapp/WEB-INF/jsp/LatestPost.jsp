
<section class="recipes-section spad pt-0">
	<div class="container">
		<div class="section-title">
			<h2>Latest recipes</h2>
		</div>
		<div class="row">
			<c:forEach var="post" items="${latestPost}">
				<div class="col-lg-4 col-md-6">
					<div class="recipe">
						<img
							src='${pageContext.request.contextPath}/uploads/${post.getRecipePicture().split(",")[0]}'
							alt="">
						<div class="recipe-info-warp">
							<div class="recipe-info">
								<a href="/c/${post.getRecipeId()}"><h3>${post.getRecipeName() }</h3></a>
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