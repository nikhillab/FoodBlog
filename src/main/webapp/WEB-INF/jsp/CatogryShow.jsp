<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container">
	<div class="section-title mt-3">
		<h2>WHAT WE'RE CRAVING NOW</h2>
	</div>
	<div class="row">
		<c:forEach var="i" begin="0" end="2">
			<div class="col-lg-4">
				<img
					src="${pageContext.request.contextPath}/public/asserts/logo.PNG"
					class="rounded-circle" width="140" height="140" />
				<h2>Heading</h2>
				<p>Donec sed odio dui. Etiam porta sem malesuada magna mollis
					euismod. Nullam id dolor id nibh ultricies vehicula ut id elit.
					Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
					Praesent commodo cursus magna.</p>
				<p>
					<a class="btn btn-secondary" href="#" role="button">View
						details &raquo;</a>
				</p>
			</div>
		</c:forEach>
	</div>
</div>