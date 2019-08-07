<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>Emolyee Services | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Employee</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode=='MODE_HOME' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>Welcome to Employee Services</h1>
					<h3>Login or Register to continue</h3>
				</div>
			</div>

		</c:when>

		<c:when test="${mode=='MODE_REGISTER' }">
			<div class="container text-center">
				<h3>New Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-user">
					<input type="hidden" name="id" value="${employee.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Employee Id </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="id"
								value="${employee.id }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name"
								value="${employee.name }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Email </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email"
								value="${employee.email }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Designation </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="designation"
								value="${employee.designation }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Contact No </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="designation"
								value="${employee.contactno }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="password"
								value="${employee.password }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
				</form>
			</div>
		</c:when>
		<c:when test="${mode=='ALL_USERS' }">
			<div class="container text-center" id="tasksDiv">
				<h3>All Users</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Employee Id</th>
								<th>Name</th>
								<th>Email</th>
								<th>Designation</th>
								<th>Contact No</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="employee" items="${employees }">
								<tr>
									<td>${employee.id}</td>
									<td>${employee.name}</td>
									<td>${employee.email}</td>
									<td>${employee.designation}</td>
									<td>${employee.contactno}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_UPDATE' }">
			<div class="container text-center">
				<h3>Update User</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-user">
					<input type="hidden" name="id" value="${user.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">Employee Id </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="id"
								value="${employee.id }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">First Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name"
								value="${employee.name }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Email </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email"
								value="${employee.email }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Designation </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="designation"
								value="${employee.designation }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Contact No </label>
						<div class="col-md-3">
							<input type="text" class="form-control" name="designation"
								value="${employee.contactno }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Update" />
					</div>
				</form>
			</div>
		</c:when>

		<c:when test="${mode=='MODE_LOGIN' }">
			<div class="container text-center">
				<h3>User Login</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/login-user">
					<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
					<div class="form-group">
						<label class="control-label col-md-3">Employee Id</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="id"
								value="${employee.id }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="password"
								value="${employee.password }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Login" />
					</div>
					</form>
					</div>
					</c:when>
	</c:choose>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>