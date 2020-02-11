<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h2>로그인</h2>
	<form action="/web/loginpro.0211" method="post">
	  <div class="form-group">
	    <label for="id">아이디</label>
	    <input type="text" name="id" class="form-control" id="id" placeholder="아이디를 입력하세요">
	  </div>
	  <div class="form-group">
	    <label for="pw">암호</label>
	    <input type="password" name="pw" class="form-control" id="pw" placeholder="암호를 입력하세요.">
	  </div>
	  <div class="checkbox">
	    <label>
	      <input type="checkbox"> 입력을 기억합니다
	    </label>
	  </div>
	  <button type="submit" class="btn btn-default">로그인</button>
	  <button type="button" class="btn btn-default" onclick="window.location.href='/web/signup.0211'">회원가입</button>
	</form>
</div>
</body>
</html>