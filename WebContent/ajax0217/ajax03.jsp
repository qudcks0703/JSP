<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	function time(){
		$.ajax({
			type:"get",
			url:"ajax01.jsp",
			success:function(data){
				$("#time").html(data);
			},
			error: function(){
			}
		});
	}
	$(document).ready(function(){
		window.setInterval("time()",1000)
	});
	
</script>
</head>
<body>

<h2> 시간</h2> <label id="time"></label>
</body>
</html>