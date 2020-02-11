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

<c:if test="${sid!=null}">
	<h2>안녕하세요 ${sid}님 환영합니다.</h2>
</c:if>
<c:otherwise>
 <h2>로그인 해주세요.</h2>
 <a href="singup.0211">로그인</a>
</c:otherwise>


</body>
</html>