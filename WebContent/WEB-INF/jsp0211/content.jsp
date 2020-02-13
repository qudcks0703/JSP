<%@page import="jsp0211.mvc.dto.M_DTO"%>
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
              <li><a href="/web/board.0211">Board</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">User Private<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="/web/userupdate.0211">User Update</a></li>
                  <li><a href="/web/userdelete.0211">User Delete</a></li>
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
	        <p>This is place where Post is written can view</p>
	      </div>
	      <div class="container">
		      <table class="table">
	            <thead>
	           		<tr>
		                <th>Title</th>
		            </tr>
		            <tr>   
		                <td>${bdto.title}</td>
					</tr>		  
					<tr>              
		                <th>Write Time</th>
		            </tr>
		            <tr>
		                <td>${bdto.reg}</td>
	              	</tr>
	            </thead>
	            <tbody>
	            	<tr>
	            		<th>Content</th>
	            	</tr>
	            	<tr>	
	            		<td>${bdto.content}</td>
	            	</tr>
	            </tbody>
	          </table>
	          <c:if test="${bdto.id == sid}">
		          <button type="button" class="btn btn-default" onclick="window.location.href='/web/boardupdate.0211?num=${bdto.num}'">Post Update</button>
		          <button type="button" class="btn btn-default" onclick="window.location.href='/web/boarddelete.0211?num=${bdto.num}'">Post Delete</button>
	          </c:if>
	          <button style="text-align:right;" type="button" class="btn btn-default" onclick="window.location.href='/web/board.0211'">Back</button>
	      </div>
	    </div>
	
	
	    <div class="container">
	      <hr/>
	<!-- Must to -->
	      <footer>
	      	<p> This is a BC place
	        <p>&copy; Company 2020</p>
	      </footer>
	    </div> <!-- /container -->
	
	
	</c:when>
	
	<c:otherwise>
	 <h2>로그인 해주세요.</h2>
	 <a href="/web/login.0211">로그인</a>
	</c:otherwise>
</c:choose>


</body>
</html>