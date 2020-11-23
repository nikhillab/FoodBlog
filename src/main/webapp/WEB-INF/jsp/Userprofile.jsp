<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
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
			<table class="table table-borderless">
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
				<td ><h5 ><b>Upload New Recipe:</b></h5></td>
					<td ><a class="btn btn-primary" href="/auth/upload">Upload</a></td>
				</tr>
				<tr>
					<td>${userDetails.getUser()}</td>
				</tr>
				<tr>
					<td>${usersRecipe}</td>
				</tr>
			</table>
			



		</div>

	</main>







</body>
<%@include file="Footer.jsp"%>