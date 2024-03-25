package edu.kh.jsp.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 상대주소여도 WebServlet() 에는 앞에 /를 무조건 써준다
@WebServlet("/jstl/main")
public class JSTLController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/jstl/main.jsp").forward(req, resp);
		
		
		
		
		
		
		
	}
	
	
}
