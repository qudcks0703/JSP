<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- script -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<script>
 $(function(){
	 var i=0;
	$("#hi").click(function(){
		if(i==0){
			$(this).removeClass('btn-danger');
			$("#hi").after("<div><p>하이룽");
			i++;
		}else{
			$(this).addClass('btn-danger');
			$("#hi").
			i--;
		}
	});
 });
</script>
</head>
<body>
<div>
<button type="button" id='hi' class="btn btn-danger">반갑다</button>
<div></div>
</div>

</body>
</html>