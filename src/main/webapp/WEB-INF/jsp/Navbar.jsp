<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>


<header>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark slideshow">
		<a class="navbar-brand" href="/?title=Foodzz"> <img
			src="${pageContext.request.contextPath}/public/asserts/logo.PNG"
			width="40" height="40" alt="Foodzz" loading="lazy">
		</a> <a class="navbar-brand" href="/?title=Foodzz">Foodzz</a>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item "><a class="nav-link" href="/?title=Home">Home
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/recipes?title=Receipies">Receipies
				</a></li>
				<li class="nav-item"><a class="nav-link "
					href="/?title=POPULAR">Festival Special</a></li>
<li class="nav-item"><a class="nav-link "
					href="/contact">Contact</a></li>

			</ul>
			<security:authorize access="isAuthenticated()">
				<ul class="navbar-nav ">
					<li class="nav-item pr-4"><a class="nav-link "
						href="/auth/user/<security:authentication property="principal.username" />
									">Profile</a></li>

					<li class="nav-item pr-4"><form:form
							action="${pageContext.request.contextPath}/logout" method="POST"
							class="nav-item">
							<input type="submit" class=" btn btn-primary" name="Logout"
								value="Logout" />
						</form:form></li>
				</ul>
			</security:authorize>
			<security:authorize access="!isAuthenticated()">
				<ul class="navbar-nav ">
					<li class="nav-item pr-4"><a class="nav-link " href="/userForm">Sign
							Up</a></li>
					<li class="nav-item pr-4"><a class="btn btn-success" href="/login">Login</a></li>
				</ul>
			</security:authorize>

		</div>
	</nav>
</header>
