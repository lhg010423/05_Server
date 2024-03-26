<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>학과가 건축학과인 학생 찾기</title>
</head>
<body>
	
	<h1>건축학과 학생 목록</h1>
	
	<table border="1">
		<tr>
			<th>번호</th>
			<th>학번</th>
			<th>이름</th>
			<th>학과</th>
			<th>주소</th>
		</tr>
		
		<forEach var="std" items="${stdList}" varStatus="vs">
			<tr>
				<td>${vs.count}</td>
				<td>${std.studentNo}</td>
				<td>${std.studentName}</td>
				<td>${std.departmentName}</td>
				<td>${std.studentAddress}</td>
			</tr>
		</forEach>
		
		
		
		
		
	</table>
	
	
	
</body>
</html>