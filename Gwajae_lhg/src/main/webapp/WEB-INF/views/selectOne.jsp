<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>내 게시판 보기</title>
</head>
<body>
	
	<c:forEach var="bo" items="${boardOne}">
		<tr>
			<th>게시글 번호</th>
			<th>제목</th>
			<th>조회수</th>
			<th>작성자ID</th>
		</tr>
		<tr>
			<td>${bo.boardNo}</td>
			<td><a href="/boardView">${bo.boardTitle}</a></td>
			<td>${bo.boardHit}</td>
			<td>${bo.writer}</td>
		</tr>
		
	</c:forEach>
	
	
	


</body>
</html>