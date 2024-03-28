package gwajae.board.service;

import java.sql.Connection;
import java.util.List;

import gwajae.board.dao.BoardDAO;
import gwajae.board.model.dto.Board;
import static gwajae.common.JDBCTemplate.*;

public class BoardService {

	private BoardDAO dao =new BoardDAO();

	/** 게시판 전체 보기
	 * @param memberId
	 * @return
	 */
	public List<Board> selectAll() throws Exception{
		
		Connection conn = getConnection();
		
		List<Board> boardList = dao.selectAll(conn);
		
		close(conn);
		
		
		return boardList;
	}

	public List<Board> selectOne(String memberId) throws Exception{
		
		Connection conn = getConnection();
		
		List<Board> boardList = dao.selectOne(conn, memberId);
		
		close(conn);
		
		return boardList;
	}
	
	
	
	
	
	
}
