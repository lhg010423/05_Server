<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TO do 수정하기</title>
	
	<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<main>
		<h1>To do 수정하기</h1>
		
		<%-- ? 뒤에는 get으로 보내는건데 method는 post로 보낸다 이렇게 해도 되는데
			<input type="hidden"> 으로 보내는게 좋음 --%>
		<%-- <form action="/update?todoNo=${todo.todoNo}" method="post"> 30번 코드 참고--%>
		<form action="/update" method="post">
			<p>제목</p>
			<input type="text" name="title" value="${todo.todoTitle}" required>
			
			<%-- textarea 도 값 넘어감 --%>
			<p>메모</p>
			<textarea name="memo" style="resize: none;
			 font-size: 18px;" cols="20" rows="5">${todo.todoMemo}</textarea>
			 
			 <input name="todoNo" value="${todo.todoNo}" type="hidden">
			 
		
			<br>
			<button class="insert-btn">수정하기</button>
		
		</form>
		
		
		
		
	</main>
	
	
	
	

</body>
</html>