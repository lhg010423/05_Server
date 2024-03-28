package gwajae.board.dao;

import static gwajae.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import gwajae.board.model.dto.Board;

public class BoardDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public BoardDAO() {
		
		try {
			prop = new Properties();
			
			String filePath = BoardDAO.class.getResource("/gwajae/sql/board-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/** 전체 게시판 출력
	 * @param conn
	 * @param memberId
	 * @return boardList
	 */
	public List<Board> selectAll(Connection conn) throws Exception{
		
		List<Board> boardList = new ArrayList<Board>();
		
		try {
			String sql = prop.getProperty("selectAll");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setBoardHit(rs.getInt("BOARD_HIT"));
				
				boardList.add(board);
				
			}
			
		} finally {
			close(rs);
			close(stmt);
		}
		return boardList;
	}

}
