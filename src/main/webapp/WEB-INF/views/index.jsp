<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>기본 로그인 페이지</h1>
	<!-- 이텔리제이는 특수문자 달러-{}할필요없어 자동으로 경로지정하나
	Eclipse는 수동으로 경로 지정해줘야한다 -->
	<a href="${pageContext.request.contextPath}/member/save">회원가입</a>
	<a href="${pageContext.request.contextPath}/member/login">로그인</a>
	<a href="${pageContext.request.contextPath}/member/userUpdate">정보 갱신</a>
	<a href="${pageContext.request.contextPath}/member/userSelect">전체 정보</a>
</body>
</html>