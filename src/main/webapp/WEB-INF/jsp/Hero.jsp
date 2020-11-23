
<!-- Hero section -->
<section class="hero-section">
	<div class="hero-slider owl-carousel">
		<c:forEach var="offer" items="${offerList}">
			<div class="hero-slide-item set-bg"
				data-setbg="${pageContext.request.contextPath}/public/asserts/${offer.getImageName()}">
				<div class="hs-text">
					<h2 class="hs-title-1">
						<span>${offer.getLabel()}</span>
					</h2>
					<h2 class="hs-title-2">
						<span>${offer.getDiscription()}</span>
					</h2>
					<h2 class="hs-title-3">
						<span>for all the foodies</span>
					</h2>
				</div>
			</div>
		</c:forEach>
	</div>
</section>