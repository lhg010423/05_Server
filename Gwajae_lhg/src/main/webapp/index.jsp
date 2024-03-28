<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>gwajae_login</title>
	
	<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>
	<main>
		
		<c:choose>
			<%-- 로그인을 하지 않았다면 : 로그인/회원강비 입력 폼 출력 --%>
			<c:when test="${empty sessionScope.loginMember}">
				
				<h1>게시판 로그인</h1>
				
				<form action="/login" method="post" class="login-form">
					<div>
						<p>아이디</p>
						<input type="text" name="inputId">
					</div>
					<div>
						<p>패스워드</p>
						<input type="password" name="inputPw">
					</div>
					
					<button>로그인</button>
					
					<a href="/signup" class="signup">회원가입</a>
					
				</form>
			
			</c:when>
			
			
			<%-- 로그인을 했다면 : 현재 로그인한 사람의 todolist 출력 --%>
			<c:otherwise>
				<h1>전체 게시글</h1>
				<table>
					<tr>
						<th>게시판번호</th>
						<th>제목</th>
						<th>조회수</th>
					</tr>
				
					<c:forEach var="bd" items="${boardList}">
						<tr>
							<td><a href="">${bd.boardNo}</a></td>
							<td>${bd.boardTitle}</td>
							<td>${bd.boardHit}</td>
						
						</tr>
					</c:forEach>
				</table>
			</c:otherwise>
					
				
				
				
				<%-- 
				<c:choose>
					
					<c:when test="${empty boardList}">
						
						<h1>게시판 없음</h1>
					
					</c:when>
					
					
					<c:otherwise>
						<table href="/selectAll">
							<c:forEach var="board" items="${boardList}">
								<tr>
									<th>게시판 번호</th>
									<th>제목</th>
									<th>조회수</th>
								
								</tr>
							
							</c:forEach>
						</table>
					</c:otherwise>
				</c:choose>
				--%>
				
		</c:choose>
	
	</main>
	
	
</body>
</html>