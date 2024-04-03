package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jsp.model.dto.Book;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/elTest")
public class ELTestController extends HttpServlet{
	
	// a태그 요청 (get방식)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// jsp 경로는 어디기준? webapp 기준
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/el/elTest.jsp");
		
		dispatcher.forward(req, resp);
	}
	
	// 둘다 똑같은 /elTest를 써도 하나는 Get 또하나는 Post로 다르니 가능하다
	// elTest.jsp 요청 온 form 태그 요청 (Post 방식)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 새로운 값을 req에 세팅
		req.setAttribute("address", "서울시 중구 남대문로 120");
		req.setAttribute("score", 100);
		
		List<String> strList = new ArrayList<String>();
		strList.add("가가가");
		strList.add("나나나");
		strList.add("다다다");
		
		req.setAttribute("strList", strList);
		
		// Book 객체 Attribute 세팅
		// @1
		Book book = new Book("어린왕자", "생택쥐베리", 4000);
		
		req.setAttribute("book", book);
		
		
		// null과 비어있다
		List<String> list1 = null; // null
		List<String> list2 = new ArrayList<String>(); // 비어있음
		
		
		req.setAttribute("list1", list1);
		req.setAttribute("list2", list2);
		
		
		
		// @1 부터 지금까지 내용을 요청위임하기 전에 해야함
		
		// 요청 위임
		RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/views/el/elResult.jsp");
		
		dis.forward(req, resp);
		// 파라미터, 어트리뷰트(속성) 가 req 안에 실려있음
		
		
	}
	
	
	
	
}
