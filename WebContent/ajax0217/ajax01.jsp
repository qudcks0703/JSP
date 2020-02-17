<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	<%
	
		java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		java.util.Date day=new java.util.Date();
	%>
	시간<%=sdf.format(day) %>
</body>
</html>