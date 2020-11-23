<%@include file="Head.jsp"%>

<body>
	<%@include file="Navbar.jsp"%>
	<main role="main" class="container mt-3" >
		<div class="section-title">
			<h2>Upload Photos</h2>
		</div>

		<form:form action="/auth/fileupload" enctype="multipart/form-data" method="post">
			<div class="form-group row">
 
				<div class="col-sm-10">
					<input type="file" name="files" multiple="multiple"
						class=" mt-3">
				</div>
			</div>
			<div class="form-group row">

				<div class="col-sm-10">
					<input type="submit" value="submit" class="btn btn-primary mt-3">
				</div>
			</div>
		</form:form>

	</main>
	<%@include file="Footer.jsp"%>