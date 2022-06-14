<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="세션을 사용하는 페이지"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${ empty paramData }">
<!-- 세션이 없을 때의 처리 -->
<%
String data="jsp에서 호출";
data="http://localhost/servlet_prj/set_session?param="+URLEncoder.encode(data,"UTF-8");
%>
<c:redirect url="<%=data %>"/>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--공통 CSS-->
<link rel="stylesheet" type="text/css" href="http://211.63.89.143/servlet_prj/common/CSS/main_20220321.css">
<style type="text/css">

</style>
<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!-- bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

<script type="text/javascript">
$(function(){
	
});//ready
</script>
</head>
<body>
<div>
세션의 값 : <c:out value="${paramData }"/><br/>
<a href="http://localhost/servlet_prj/remove_session">세션 삭제하기</a>

<%--<c:choose>
<c:when test="${empty paramData }">
세션에 값 없음</c:when>
<c:otherwise>
세션에 값 있음
</c:otherwise> 
</c:choose> --%>
</div>
</body>
</html>