<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="id" value="tmddh"/>
	<c:set var="pw" value="123123"/>
	<h1>id : ${id}</h1>
	<h1>pw : ${pw}</h1>
	
	<c:remove var="id"/>
	<c:remove var="pw"/>
	<h1>id : ${id }</h1>
	<h1>pw : ${pw }</h1>
	
	<c:set var="a" value="28"/>
	<c:if test="${a>=28}">
		<h1>${a}는 28보다크거나 같다.</h1>
	</c:if>
	
	<c:choose>
		<c:when test="${a>28}">
			<h1>28보다 크다</h1>
		</c:when>
		
	
	</c:choose>
	
	<c:forEach var="i" begin="2" end="2" step="1">
		<c:forEach var="j" begin="1" end="9" step="1">
			<h1>${i}*${j}=${i*j}</h1>
		</c:forEach>	
	</c:forEach>
	
</body>
</html>