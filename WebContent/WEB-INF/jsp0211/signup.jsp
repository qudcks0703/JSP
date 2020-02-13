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
<script>

function check(){
	var a=document.forms[0];
	if(!a.id.value){
		alert('아이디 입력');
		a.id.focus();
		return false;
	}	
	else if(!a.pw.value){
		alert('암호 입력');
		a.pw.focus();
		return false;
	}	
	else if(!a.pwch.value){
		alert('암호가 서로 틀림');
		a.pwch.focus();
		return false;
	}	
	
}

</script>
</head>
<body>
 <nav class="navbar navbar-inverse">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/web/main.0211">${sid} Hello</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="/web/main.0211">Home</a></li>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
            	<li><a href="/web/singup.0211">Sign up</a></li>
            	<li><a href="/web/login.0211">Login</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>
<div class="container">
	<h2>회원가입</h2>
	<form action="/web/signuppro.0211" method="post" onsubmit="return check()">
	  <div class="form-group">
	    <label for="id">*아이디</label>
	    <input type="text" name="id" class="form-control" id="id" placeholder="아이디를 입력하세요">
	  </div>
	  <div class="form-group">
	    <label for="pw">*암호</label>
	    <input type="password" name="pw" class="form-control" id="pw" placeholder="암호를 입력하세요.">
	  </div>
	  <div class="form-group">
	    <label for="pwch">*암호 확인</label>
	    <input type="password" name="pwch" class="form-control" id="pwch" placeholder="다시한번 암호를 입력하세요.">
	  </div>
	  <div class="form-group">
	    <label for="name">이름</label>
	    <input type="text" name="name" class="form-control" id="name" placeholder="이름을 입력하세요.">
	  </div>
	  <button type="submit" class="btn btn-default">회원가입</button>
	  <button type="button" class="btn btn-default" onclick="window.location.href='/web/login.0211'">로그인</button>
	</form>
</div>
	<div class="container">
		<hr>
	      <footer>
	      	<p> This is a BC place
	        <p>&copy; Company 2020</p>
	      </footer>
	</div>
</body>
</html>