<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>기본 페이지</h2>
<c:if test="${id!=null}">
	<c:redirect url="main.0210"/>
</c:if>

<c:if test="${result==0}">
	<script>
		alert("비번 틀림");
		history.go(-1);
	</script>
</c:if>

<c:if test="${result==-1}">
	<script>
		alert("비번 틀림");
		history.go(-1);
	</script>
</c:if>
</body>
</html>