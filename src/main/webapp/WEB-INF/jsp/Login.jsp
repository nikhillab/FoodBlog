<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Head.jsp"%>
<body>
	<%@include file="Navbar.jsp"%>

	<main>
		<div class="container ">
			<div class="row">
				<div
					class="col-md-12 min-vh-100 d-flex flex-column justify-content-center">
					<div class="row">
						<div class="col-lg-6 col-md-8 mx-auto">

							<!-- form card login -->
							<div class="card rounded shadow shadow-sm ">
								<div class="section-title mt-3 pl-3">
									<h2>Login</h2>
								</div>
								
								<div class="card-body">
							
									<form:form action="${pageContext.request.contextPath}/authlogin" method="POST">
									
										<div class="form-group">
										
											<label for="username">Email</label>
											
											<input name="username"
												class="form-control form-control-lg rounded-0" type="text"
												placeholder="Enter Your Email" required="required" />
												
										</div>
										
										<div class="form-group">
										
											<label for="password">Password</label>
											
											<input name="password"
												class="form-control form-control-lg rounded-0" type="password"
												placeholder="Enter Your Password" required="required" />
												
										</div>
										
										<button type="submit"
											class="btn btn-success btn-lg float-right" id="btnLogin">Login</button>
											
									</form:form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<%@include file="Footer.jsp"%>