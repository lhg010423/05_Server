package gwajae.member.controller;

import java.io.IOException;

import gwajae.member.model.service.MemberService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 아이디, 비번 가져오기
		String inputId = req.getParameter("inputId");
		String inputPw = req.getParameter("inputPw");
		
		MemberService service = new MemberService();
		
		Member loginMember = service.login(inputId, inputPw);
		
		HttpSession session = req.getSession();
		
		
		
	}
	
	
}
