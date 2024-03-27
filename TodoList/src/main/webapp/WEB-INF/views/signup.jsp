<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 가입</title>
	
	<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<main>
		<h1>회원가입</h1>
		
		<%--                           class 는 css때문에 주는거    js에 validate()함수 실행--%>
		<form action="/signup" method="post" class="signup-form" onsubmit="return validate()">
		<%--  onsubmit 이 true가 아니면 action으로 데이터 못보냄 --%>
			<p>아이디</p>
			<%-- name 꼭필요함, 자바스크립트 적용할려고 id를 씀,  자동완성 끄기,  아무것도입력안하고 버튼누르면 이칸은필수입력칸입니다라고 알림뜸    --%>
			<input type="text" name="inputId" id="inputId" autocomplete="off" required>
			<span id="idMsg">영어 소문자, 숫자, 특수문자 포함 6~14글자</span>
			
			<p>비밀번호</p>
			<input type="password" name="inputPw" id="inputPw" required>
			
			<p>비밀번호 확인</p>
			<input type="password" name="inputPw2" id="inputPw2" required>
			<%-- span 쓰는 이유 : 비밀번호가 일치하지 않으면 자바스크립트에서 처리할려고 씀 --%>
			<span id="pwMessage"></span>
			
			<p>닉네임</p>
			<input type="text" name="inputName" id="inputName" required>
			<span id="nameMessage"></span>
			<br>
			
			<button>가입하기</button>
			
			<%-- 아이디, 비밀번호 등등 규격에 맞으면 회원가입 가능하게 자바스크립트 정규표현식을 씀 --%>
			
		</form>
	
	</main>
	
	<%-- js, css 불러쓸때는 webapp 기준 --%>
	<%-- 해당 jsp 파일에서 사용할 javascript 코드가 작성된 js 파일 연결하기 --%>
	<script src="/resources/js/signup.js"></script>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>