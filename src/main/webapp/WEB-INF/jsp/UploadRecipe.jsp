<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Head.jsp"%>
<body>
	<%@include file="Navbar.jsp"%>
	<section class="contact-section spad">

		<main class="container mt-3 ">
			<div class="section-title">
				<h2>Upload New Recipe</h2>
			</div>
			<form:form action="/auth/uploadHandler" modelAttribute="recipeForm">
				<div class="form-group row">

					<div class="col-sm-10">
						<form:input path="title" class="form-control mt-3" type="text"
							placeholder=" Recipe Title" required="required" />
						<form:errors path="title" class="alert alert-warning mt-3" />
					</div>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:textarea path="summary" class="form-control mt-3"
							type="text" placeholder=" Recipe Summary" rows="4" />
						<form:errors path="summary" class="alert alert-warning mt-3" />

					</div>
				</div>
				<div class="section-title">
					<h4>CATEGORIES</h4>
					<hr>
				</div>
				<div class="form-group row">

					<span class="small ml-3"><i>TYPE:</i></span>
					<div class="col-sm-2">
						<form:input path="type" class="form-control mt-3" type="text"
							placeholder="Recipe Type" />
						<form:errors path="type" class="alert alert-warnin4g mt-3" />
					</div>
					<!-- </div>
				<div class="form-group row"> -->
					<span class="small ml-3"><i> COOKING TIME:</i></span>

					<div class="col-sm-2">
						<form:input path="time" class="form-control mt-3" type="text"
							placeholder="Time to make." />
						<form:errors path="time" class="alert alert-warning mt-3" />

					</div>
					<!-- </div>
				<div class="form-group row"> -->
					<span class="small ml-3"><i>SERVES:</i></span>

					<div class="col-sm-2">
						<form:input path="serves" class="form-control mt-3" type="text"
							placeholder="Recipe Serves" />
						<form:errors path="serves" class="alert alert-warning mt-3" />

					</div>
				</div>
				<div class="section-title">
					<h4>INGREDIENTS</h4>
					<p class="small ml-3">Enter your ingredients one at a time or
						paste them into the box below and Seperate by (,) so we can get
						most of it.</p>
					<hr>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:textarea path="ingredents" class="form-control mt-3"
							type="text" placeholder="Enter Recipe Ingredents" rows="4" />
						<form:errors path="ingredents" class="alert alert-warning mt-3" />

					</div>
				</div>
				<div class="section-title">
					<h4>DIRECTIONS</h4>
					<p class="small ml-3">Enter your directions one step at a time
						or paste them into the box below and hit enter.</p>
					<hr>
				</div>
				<div class="form-group row">

					<div class="col-sm-10">
						<form:textarea path="process" class="form-control mt-3"
							type="text" placeholder="Enter Recipe Process" rows="4" />
						<form:errors path="process" class="alert alert-warning mt-3" />
					</div>
				</div>


				<div class="form-group row">
					<div class="col-sm-10">
						<form:input path="tags" class="form-control mt-3" type="text"
							placeholder="Enter Tags for Recipe" />
						<form:errors path="tags" class="alert alert-warning mt-3" />
						<span class="small ml-3"><i>Don't Forgot To add the
								Tags.</i></span>
					</div>
				</div>

				<div class="form-group row mt-3">

					<div class="col-sm-10">

						<input type="submit" value="Next" class="btn btn-primary" /> <span
							class="small ml-3"><i>Click on next to Upload photos.</i></span>

					</div>
					<div class="form-group row"></div>
				</div>
			</form:form>
		</main>
	</section>
	<%@include file="Footer.jsp"%>