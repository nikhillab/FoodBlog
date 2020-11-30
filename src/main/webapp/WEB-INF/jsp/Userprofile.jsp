<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Head.jsp"%>
<body>
	<%@include file="Navbar.jsp"%>
	<main class="container">
		<div class="col-lg-12 mt-5">

			<img src="${pageContext.request.contextPath}/public/img/thumb/7.jpg"
				class="rounded-circle" width="150" height="150" />
			<hr>
			<h2>

				<security:authentication property="principal.username" />
			</h2>
			<hr>
			<table class="table table-borderless col-lg-4">
				<tr>
					<td><h5>
							<b>First Name:</b>${userDetails.getFirstName()}</h5></td>
					<td><h5>
							<b>Last Name:</b>${userDetails.getLastName()}</h5></td>
				</tr>
				<tr>
					<td><h5>
							<b>Gender:</b>${userDetails.getGender()}</h5></td>
					<td><h5>
							<b>Continent:</b>${userDetails.getContinents()}</h5></td>
				</tr>
				<tr>
					<td><h5>
							<b>Upload New Recipe:</b>
						</h5></td>
					<td><a class="btn btn-primary" href="/auth/upload">Upload</a></td>
				</tr>
				<tr>
					<td>${userDetails.getUser()}</td>
				</tr>
			</table>
			<div class="section-title mt-3">
				<h2>Your Uploads</h2>
			</div>

			<div class="row">
				<c:forEach var="recipe" items='${ usersRecipe.getUserRecipe()}'>
					<div class="col-lg-4">

						<img
							src='${pageContext.request.contextPath}/uploads/${recipe.getRecipePicture().split(",")[0]}'
							class="rounded-circle" width="140" height="140"
							alt='${pageContext.request.contextPath}/uploads/${recipe.getRecipePicture().split(",")[0]}' />
						<h2>${recipe.getRecipeName()}</h2>
						<p>${recipe.getRecipeDescription().getSummary()}</p>
						<p>
							<a class="btn btn-secondary" href="/c/${recipe.getRecipeId()}" role="button">Full Recipe  &raquo;</a>
						</p>
					</div>
				</c:forEach>
			</div>



		</div>

	</main>







</body>
<%@include file="Footer.jsp"%>