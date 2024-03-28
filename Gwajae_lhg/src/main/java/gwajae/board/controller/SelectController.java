package gwajae.board.controller;

import java.io.IOException;
import java.util.List;

import gwajae.board.model.dto.Board;
import gwajae.board.service.BoardService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/selectOne")
public class SelectController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BoardService service = new BoardService();
		
		try {
			String memberId = req.getParameter("memberId");
			
			List<Board> boardOne = service.selectOne(memberId);
			
			req.setAttribute("boardOne", boardOne);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("/WEB-INF/views/selectOne.jsp").forward(req, resp);
		
	}
	
}
