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
<c:if test="${result==1}">
	<script>
		alert("Board Delete Success")
		window.location.href="/web/board.0211";
	</script>
</c:if>
<c:if test="${result==0}">
	<script>
		alert("Board Delete Error Detail=Database Error");
		history.go(-1);
	</script>
</c:if>
<c:if test="${result==-1}">
	<script>
		alert("Don't come");
		history.go(-1);
	</script>
</c:if>

</body>
</html>