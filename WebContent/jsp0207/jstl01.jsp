<%@page import="web.jsp0207.TestVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 1. 변수 선언 : set
		var : 변수명
		홑태그 - value : 값
		쌍태그 - 태그 중간에 값 작성
	
	--%>
	<c:set var="id" value="java"/>
	<c:set var="pw">1234</c:set>
	<h2>id : ${id}</h2>
	<h2>pw : ${pw}</h2>

	<%-- 프로퍼티 값 설정 (방식 통일해서 사용하기) 
	<% TestVo vo = new TestVo(); %>
	<c:set target="<%=vo%>" property="id"value="test" />
	
	<h2>vo.id = <%=vo.getId() %></h2>--%>
	
	<jsp:useBean id="vo" class="web.jsp0207.TestVo" />
	<c:set target="${vo}" property="id" value="test"/>
	<h2>vo.id : ${vo.id}</h2>
	
	<%-- 2.변수 삭제  --%>
	<c:remove var="id"/>
	<c:remove var="pw"/>
	<h2>id : ${id}</h2>
	<h2>pw : ${pw}</h2>
	
	<%-- 3 if 문
		test: 조건식 EL로 작성
		c : if 태그 사이에 조건식 참일경우 실행 (출력)할 내용 작성
	 --%>
	<c:set  var="num" value="100"/>
	<c:if test="${num >= 100 }">
		<h2>${num}은 100보다 크거나 같다.</h2>
	</c:if>
	<c:if test="${num < 100 }">
		<h2>${num}은 100보다 작다</h2>	
	</c:if>
	
	
	<%-- choose --%>
	<c:choose>
		<c:when test="${num > 100 }">
			<h2> 100보다 크다</h2>
		</c:when>
		<c:when test="${num<100 }">
			<h2>100보다 작다</h2>
		</c:when>
		<c:otherwise>
			<h2>100과 같다</h2>
		</c:otherwise>
	</c:choose>
	
	
	<%-- forEach 
		var : 반복하며 데이터를 담아줄 변수
		items : 반복시킬 배열변수지정
	--%>
	<c:set  var= "arr" value="<%=new int[]{1,2,3,4,5} %>"/>
	<c:forEach var="i" items="${arr}">
		<h2>${i}</h2>
	</c:forEach>
	
	<c:forEach var="i" begin="0" end="10" step="1">
		<h2>${i}</h2>
	</c:forEach>
		
		
	<%-- 구구단 출략 : 2단부터 9단까지 --%>
	<c:forEach var="i" begin="2" end="9" step="1">
			<h3>****${i}단****</h3>
		<c:forEach var="j" begin="1" end="9" step="1">
			<h2>${i}*${j} = ${i*j} </h2>	
		</c:forEach>
	</c:forEach>
	
	<c:forEach var="a" items="${arr}" varStatus="status">
		<h4>${status.count} : ${status.index} : ${status.current }</h4>	
	</c:forEach>
	
	<%--
		status.index : 0부터 시작하는 루프의 인덱스
		status.count : 현재 몇번째 루프인지 값 . 1부터 시작
		status.current : var 속성값
		status.firts : 현재 첫번째 루프이면 참입니다
		status.last : 현재 마지막 루프이면 참입니다
	 --%>
	 
	 <c:forTokens var="a" items="a,b,c,d,e,f,g" delims=",">
	 	<h2>${a}</h2>	 
	 </c:forTokens>
	 
	 <%-- c:import : include 와 비슷 --%>
	 <c:import var="test" url="jsptest.jsp"></c:import>
	${test}
		
		
	<%--redirect : response.sendRedirect()와 동일한 기능
	<c:redirect url="jsptest.jsp" />	
	--%>
	
	<%-- url 
	<c:url var="u" value="jsptest.jsp">
		<c:param name="id"  value="java" />
		<c:param name="pw"  value="1234"/>	
	</c:url>	
	<c:redirect url="${u}"/>
	--%>
	
	<c:out value="${num}" />
	

	
	
	
	
</body>
</html>