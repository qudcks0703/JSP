<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%request.getAttribute("num"); %>
	<%request.getAttribute("id"); %>
	<h2> EL : ${requestScope.num}</h2>
	<h2> EL : ${id}</h2>
	
	<h2> 기존 :<%request.getAttribute("data");%></h2>
	<h2> EL : ${data}</h2>
	
	
	<h2> 기존 : age = <%--(Integer)request.getAttribute("age")+10 --%></h2>
	<h2> EL : ${age+10}</h2>
	
	
	<h2>num=${sessionScope.num}</h2>
	<h2>memID=${memId}</h2>
	
	<h2>arr=${arr[1]}</h2>
	
	<h2>list=${list}</h2>
	<h2>list = ${list[0]}</h2>
	<h2>list = ${list.get(0)}</h2>
	
	
	
	
	
</body>
</html>