<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/member/login" name="frm"  method="post" >
		<input type="text" name="email"><br>
		<input type="text" name="pwd"><br>
		<button>로그인</button>
		<a href="${pageContext.request.contextPath}/member/save">회원가입</a>
	</form>
	
</body>
</html>