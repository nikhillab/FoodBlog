<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@include file="Head.jsp"%>
<body>
	<%@include file="Navbar.jsp"%>
	<div id="preloder">
		<div class="loader"></div>
	</div>
	<section class="contact-section spad">

		<main class="container mt-3 ">
			<div class="section-title">
				<h2>Sign Up Now</h2>
			</div>
			<%
				String message = request.getParameter("message");
			if(!(message==null))
			     out.print("<div class='alert alert-warning '>" + message + "</div>");
			%>

			<form:form action="/validForm" modelAttribute="userForm"
				method="POST">
				<div class="form-group row">

					<div class="col-sm-10">
						<form:input path="firstName" class="form-control mt-3" type="text"
							placeholder="Enter First Name" required="required" />
						<form:errors path="firstName" class="alert alert-warning mt-3" />
					</div>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:input path="lastName" class="form-control mt-3" type="text"
							placeholder="Enter Last Name" />
						<form:errors path="lastName" class="alert alert-warning mt-3" />
					</div>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:input path="email" class="form-control mt-3" type="email"
							placeholder="Enter Your Email Address" required="required" />
						<form:errors path="email" class="alert alert-warning mt-3" />
					</div>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:input path="password" class="form-control mt-3"
							type="password" placeholder="Enter Your Password"
							required="required" />
						<form:errors path="password" class="alert alert-warning mt-3" />
					</div>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:input path="conformPassword" class="form-control mt-3"
							type="password" placeholder="Conform Your Password"
							required="required" />
						<form:errors path="conformPassword"
							class="alert alert-warning mt-3" />
					</div>
				</div>

				<div class="form-group row">

					<div class="col-sm-10 ">
						Gender: Male
						<form:radiobutton path="gender" value="Male" />
						Female
						<form:radiobutton path="gender" value="Female" />
						<form:errors path="gender" class="alert alert-warning mt-3" />
					</div>
				</div>

				<div class="form-group row">
					<div class="col-sm-10">
						Continents:
						<form:select path="continents" class="custom-select my-1 mr-sm-2">
							<form:option value="Antarctica" label="Antarctica" />
							<form:option value="Asia" label="Asia" />
							<form:option value="Australia" label="Australia" />
							<form:option value="Europe" label="Europe" />
							<form:option value="North America" label="North America" />
							<form:option value="South America" label="South America" />
						</form:select>
						<form:errors path="continents" class="alert alert-warning mt-3" />
					</div>

				</div>
				<div class="form-group row mt-3">

					<div class="col-sm-10">

						<input type="submit" value="Sign Up" class="btn btn-primary">
					</div>
					<div class="form-group row"></div>
				</div>
			</form:form>
		</main>
	</section>
	<%@include file="Footer.jsp"%>