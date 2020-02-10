<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<fmt:requestEncoding value="utf-8"/>

<!-- request 요청된 date받기 -->
<fmt:formatDate value="${day}" /><br/>
<fmt:formatDate value="${day}" type="date"/><br/><br/>
<!--  다른 느낌 -->
${day}
<fmt:formatDate value="${day}" dateStyle="full"/><br/>
<fmt:formatDate value="${day}" type="time"/><br/>
<fmt:formatDate value="${day}" type="both"/><br/>
<fmt:formatDate value="${day}" type="both" dateStyle="short"/><br/>
<fmt:formatDate value="${day}" type="both" dateStyle="medium"/><br/>
<fmt:formatDate value="${day}" type="both" dateStyle="long"/><br/>
<fmt:formatDate value="${day}" type="both" dateStyle="full"/><br/><br/>
<fmt:formatDate value="${day}" type="both" timeStyle="full" dateStyle="full"/><br/>
<hr/>
<!--  숫자  포맷 -->
<fmt:formatNumber value="1000000" groupingUsed="true" /><!-- 1 -->
<fmt:formatNumber value="1000000" groupingUsed="false" /><!-- 2 -->
<br/>
<fmt:formatNumber value="1000000" type="number"/><!-- 1 -->&nbsp;
<fmt:formatNumber value="100.25" type="currency" currencySymbol="\\" /><!-- 3 -->
<fmt:formatNumber value="100.25" type="currency" currencySymbol="$" /><!-- 3 -->
<fmt:formatNumber value="0.3" type="percent"/>
<fmt:formatNumber value="100.1234" pattern=".0"/>
<fmt:formatNumber value="100.1234" pattern=".00"/><hr/>
<!-- 나라별 시간 -->
<fmt:timeZone value="GMT">
	GMT 영국: <fmt:formatDate value="${day}" type="both"/><br/>
</fmt:timeZone>
<fmt:timeZone value="GMT-8">
	GMT-8 뉴욕: <fmt:formatDate value="${day}" type="both"/>
</fmt:timeZone>
<hr/>
<!-- 문자열을 숫자로 변환 -->
<fmt:parseNumber value="10000.2222" var="result" integerOnly="true"/>
result:${result}

</body>
</html>