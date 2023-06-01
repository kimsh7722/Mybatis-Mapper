<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.calendar {
		width:auto;
		height:auto;
		border:1px solid black;
	}
</style>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/member/save" name="joinfrm"  method="post"  onsubmit="return false">
		<input type="text" name="email" placeholder="email"><br>
		<input type="text" name="password" placeholder="password"><br>
		<input type="text" name="pwdchk" placeholder="pwdchk"><br>
		<input type="text" name="memberName" placeholder="name"><br>
		<div class="calendar">
		<span>년도</span>
		<select name="year" id="year">
			<option value="년도">년도</option>
		</select>
		<select name="month" id="month">
			<option value=월>월</option>
		</select>
		<select name="day" id="day">
			<option value=일>일</option>
		</select>
		<br>
		<span>전화번호</span>
		<select name="tel1" id="tel">
			<option value="02">02</option>
			<option value="031">031</option>
			<option value="032">032</option>
			<option value="033">033</option>
			<option value="041">041</option>
			<option value="042">042</option>
			<option value="043">043</option>
			<option value="044">044</option>
			<option value="051">051</option>
			<option value="052">052</option>
			<option value="053">053</option>
			<option value="054">054</option>
			<option value="055">055</option>
			<option value="061">061</option>
			<option value="062">062</option>
			<option value="063">063</option>
			<option value="064">064</option>
			<option value="070">070</option>
		</select>
		-
		<input type="text" name="tel2" style="width: 100px;">-<input type="text" name="tel3" style="width: 100px;">
		<br>
		<span>휴대폰</span>
		<select name="phone1" id="phone">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
		</select>
			-
		<input type="text" name="phone2" style="width: 100px;">-<input type="text" name="phone3" style="width: 100px;">
		</div>
		<input type="text" name="emailid">
		@
		<input type="text" name="inputEmail">
		<select name="subemail" id="subemail" onchange="EmailList(this.value)">
			<option value="">메일계정선택</option>
			<option value="naver.com">naver.com</option>
			<option value="nate.com">nate.com</option>
			<option value="hanmail.net">hanmail.net</option>
			<option value="gmail.com">gmail.com</option>
			<option value="hotmail.com">hotmail.com</option>
			<option value="outlook.com">outlook.com</option>
			<option value="empal.com">empal.com</option>
			<option value="dreamwiz.com">dreamwiz.com</option>
			<option value="lycos.co.kr">lycos.co.kr</option>
			<option value="yahoo.co.kr">yahoo.co.kr</option>
			<option value="korea.com">korea.com</option>
			<option value="paran.com">paran.com</option>
		</select>
		<br>
		<span>이메일 수신확인</span>
		<div class="radio-input">
			<input type="radio" id="yes" value="Y" name="emailchk"><label for="yes" style="margin-right: 20px;">예</label>
			<input type="radio" id="no" value="N" name="emailchk"><label for="no">아니오</label>
		</div>
		<button type="button" onclick="joinbtn()">회원가입</button>
	</form>
	
	
	<script type="text/javascript" defer>
	// Select에서 option 추가 
	var year1 = document.getElementById('year')
	var month1 = document.getElementById('month')
	var day1 = document.getElementById('day')
	const join=document.joinfrm
	var date = new Date();
	var setYear = date.getFullYear();
	console.log("전체날짜"+date)
	console.log("년도만 "+setYear);
	for(var i=setYear-202; i<=setYear; i++) {
		console.log("년도"+year1)
	    year1.insertAdjacentHTML("beforeend",`<option value=${setYear}>${setYear}</option>`);
	    setYear--
	}
	    
	for(var i=1; i<=12; i++) {
	    // 새로운 태그를 생성해주는 함수
	    month1.insertAdjacentHTML("beforeend",`<option value=${i}>${i}</option>`);
	}
	    
	for(var i=1; i<=30; i++) {
	    // 새로운 태그를 생성해주는 함수
	    day1.insertAdjacentHTML("beforeend",`<option value=${i}>${i}</option>`);
	}
	
	function EmailList(email) {
	    // alert(document.joinfrm.email.value)
	    email=join.subemail.value;
	    console.log(email)
	    join.inputEmail.value=email
	}
	
	function joinbtn() {
	    if(join.email.value.trim() == "") {
	        alert("아이디가 입력되지 않았습니다")
	        join.email.focus()
	        return false
	    }
	    else if(join.password.value.trim() == "") {
	        alert("비밀번호가 입력되지 않았습니다")
	        join.password.focus()
	        return false
	    }
	    else if(join.pwdchk.value.trim() == "") {
	        alert("비밀번호 확인란이 입력되지 않았습니다")
	        join.pwdchk.focus()
	        return false
	    }
	    else if(join.memberName.value.trim() == "") {
	        alert("성명이 입력되지 않았습니다")
	        join.memberName.focus()
	        return false
	    }
	    else if(join.phone2.value.trim() == "") {
	        alert("휴대전화가 입력되지 않았습니다")
	        join.phone2.focus()
	        return false
	    }
	    else if(join.phone3.value.trim() == "") {
	        alert("휴대전화가 입력되지 않았습니다")
	        join.phone3.focus()
	        return false
	    }
	    join.submit()
	}
	</script>
</body>
</html>