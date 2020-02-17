<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function(){
		$("button").click(function(){
			$.ajax({
				type:"post",
				url:"ajax04.jsp",
				data:{id:$("#id").val(),pw:$("#pw").val()},
				success:function(data){
					$("#result").html(data);
					$("#result").css("color","red")
				}
			});
		});
		$("#id,#pw").keyup(function(){
			$.ajax({
				type:"post",
				url:"ajax04.jsp",
				data:{id:$("#id").val(),pw:$("#pw").val()},
				success:function(data){
					$("#result").html(data);
					$("#result").css("color","red")
				}
			});
		});
	});
</script>
</head>
<body>
	아이디:<input type="text" id="id" name="id"/><br/>
	패스워드:<input type="text" id="pw" name="pw"/><br/>
	<button>전송</button>
	<div id="result"></div>
</body>
</html>