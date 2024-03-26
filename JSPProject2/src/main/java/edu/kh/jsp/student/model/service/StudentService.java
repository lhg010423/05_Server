package edu.kh.jsp.student.model.service;

import java.sql.Connection;
import java.util.List;

import static edu.kh.jsp.common.JDBCTemplate.*;
import edu.kh.jsp.student.model.dao.StudentDAO;
import edu.kh.jsp.student.model.dto.Student;

public class StudentService {
	
	private StudentDAO dao = new StudentDAO();

	/** 학생 전체 조회 서비스
	 * @return stdList
	 */
	public List<Student> selectAll() throws Exception{
		
		// 1. 커넥션 생성
		Connection conn = getConnection();
		
		// 2. DAO 호출
		List<Student> stdList = dao.selectAll(conn);
		
		// 3. SELECT 할꺼니까 트랙잭션 제어 X
		
		// 4. Connection 반환
		close(conn);
		
		// 5. 결과 반환
		return stdList;
	}

	/** 학과가 건축학과인 학생 찾기
	 * @return stdList
	 */
	public List<Student> selectArch() throws Exception{
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectArch(conn);
		
		close(conn);
		
		return stdList;
	}

	public List<Student> selectOne(String deptName) throws Exception{
		
		Connection conn = getConnection();
		
		List<Student> stdList = dao.selectOne(conn, deptName);
		
		close(conn);
		
		return stdList;
	}
	
	
	
	
	
	
	
	
	
	
	
}
