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
<c:choose>
	<c:when test="${result==1}">
		<script>
			alert("회원가입 추카링");
			window.location.href="/web/login.0211";
		</script>
	</c:when>
	<c:when test="${result==0}">
		<script>
			alert("회원가입 안되쩡");
			history.go(-1);
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert("비정상적인 접근입니다.");
			window.location.href="/web/login.0211";
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>