<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	request.setAttribute("name", "파이리");
%>
<body>
	요청 URI : ${pageContext.request.requestURI} <br/>
	request의 속성 : ${requestScope.name} <br/>
	파라미터 : ${param.test} <br/>
	속성명만 작성해서 데이터 꺼내오기 : ${name}
</body>
</html>