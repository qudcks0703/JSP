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
            <a class="navbar-brand" href="/web/main.0211">${sid} Hello</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="/web/main.0211">Home</a></li>
              <li><a href="/web/Board.0211">Board</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">User Private<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="/web/Userupdate.0211">User Update</a></li>
                  <li><a href="/web/Userdelete.0211">User Delete</a></li>
                </ul>
              </li>
                  <c:if test="${sid=='admin'}">
	                  <li><a href="/web/admin.0211">Admin Page</a></li>
                  </c:if>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>
      
	<div class="jumbotron">
	      <div class="container">
	        <h1>Hello, ${sid}</h1>
	        <p>This is place where Your status is changed</p>
	      </div>
	      <div class="container">
				<h2>User Update</h2>
				<form action="/web/updatepro.0211" method="post" onsubmit="return check()">
				  <div class="form-group">
				    <label for="id">ID</label>
				    <input type="text" name="id" class="form-control" id="id" value="${M_DTO.id}" readonly="readonly">
				  </div>
				  <div class="form-group">
				    <label for="pw">*암호</label>
				    <input type="password" name="pw" class="form-control" id="pw" value="${M_DTO.pw}">
				  </div>
				  <div class="form-group">
				    <label for="pwch">*암호 확인</label>
				    <input type="password" name="pwch" class="form-control" id="pwch" value="${M_DTO.pw}">
				  </div>
				  <div class="form-group">
				    <label for="name">이름</label>
				    <input type="text" name="name" class="form-control" id="name" value="${M_DTO.name}">
				  </div>
				  <button type="submit" class="btn btn-default">Update</button>
				</form>
			</div>
	    </div>
	
	    <div class="container">
	      <hr>
	
	<!-- Must to -->
	      <footer>
	      	<p> This is a BC place
	        <p>&copy; Company 2020</p>
	      </footer>
	    </div> <!-- /container -->
	
	
	</c:when>
	
	<c:otherwise>
	 <h2>로그인 해주세요.</h2>
	 <a href="singup.0211">로그인</a>
	</c:otherwise>
</c:choose>


</body>
</html>