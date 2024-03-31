<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 주문 결과</title>
</head>
<body>
	<h3>피자 종류 : <%= request.getAttribute("pizzaName") %>
					(<%= request.getParameter("size") %>)</h3>
	
	<h3>수량 : <%= request.getParameter("amount") %></h3>
	
	<h3>총 가격 : <%= request.getAttribute("price") %></h3>
	
	<%-- 클라이언트에 있는 값들은 Key : Value 형태로 PARAMETER 라는 공간에 저장
		       스코프            값들은 attribute에 저장
		                   둘다 req에 속해있다--%>
	
	
	
	
	
</body>
</html>