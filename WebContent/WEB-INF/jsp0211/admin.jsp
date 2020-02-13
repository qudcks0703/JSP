<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<c:choose>
	<c:when test="${sid!=null}">
	<!-- Must to -->
	 <nav class="navbar navbar-inverse">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/web/s.0211">${sid} Hello</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="/web/main.0211">User Page</a></li>
              <li><a href="/web/adminusers.0211">Users</a></li>
	          <li><a href="/web/adminboard.0211">Board</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
            	<li><a href="/web/logout.0211">Logout</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>
      
	<div class="jumbotron">
	      <div class="container">
	        <h1>Hello, ${sid}</h1>
	        <p>This is Admin Page</p>
	      </div>
	    </div>
	
	    <div class="container">
	      <!-- Example row of columns -->
	      <div class="row">
	        <div class="col-md-6">
	          <h2>Users</h2>
	          <p><a class="btn btn-default" href="/web/adminusers.0211" role="button">View Users &raquo;</a></p>
	        </div>
	        <div class="col-md-6">
	          <h2>Board</h2>
	          <p><a class="btn btn-default" href="/web/adminboard.0211" role="button">View Board &raquo;</a></p>
	       </div>
	      </div>
	
	      <hr>
	
	<!-- Must to -->
	      <footer>
	      	<p> This is a BC place
	        <p>&copy; Company 2020</p>
	      </footer>
	    </div> <!-- /container -->
	
	
	</c:when>
	<c:otherwise>
	 <nav class="navbar navbar-inverse">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/web/main.0211">${sid} Hello</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="/web/main.0211">Home</a></li>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
            	<li><a href="/web/singup.0211">Sign up</a></li>
            	<li><a href="/web/login.0211">Login</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>
      
	<div class="jumbotron">
	      <div class="container">
	        <h1>Hello, ${sid}</h1>
	        <p>This is place where everyone ard board and private</p>
	      </div>
	    </div>
	
	    <div class="container">
	      <!-- Example row of columns -->
	      <div class="row">
	        <div class="col-md-6">
	          <h2>Login</h2>
	          <p><a class="btn btn-default" href="/web/login.0211" role="button">Let's Login &raquo;</a></p>
	        </div>
	        <div class="col-md-6">
	          <h2>Sign up</h2>
	          <p><a class="btn btn-default" href="/web/signup.0211" role="button">Let's sign up &raquo;</a></p>
	       </div>
	      </div>
	
	      <hr>
	
	      <footer>
	      	<p> This is a BC place
	        <p>&copy; Company 2020</p>
	      </footer>
	    </div> <!-- /container -->
	</c:otherwise>
</c:choose>


</body>
</html>