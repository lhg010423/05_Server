package edu.kh.todoList.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 어노테이션 : 컴파일러한테 알려주는 주석
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든필드에 대한 매개변수 생성자
@Getter
@Setter
@ToString
public class Member {
	
	// lombok 라이브러리 : getter/setter, 생성자, toString() 자동완성 라이브러리
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String enrollDate;
	private String memberDeleteFlag;
	
	
	
	
	
}
