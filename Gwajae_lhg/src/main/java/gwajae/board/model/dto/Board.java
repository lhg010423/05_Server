package gwajae.board.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Board {
	
	private int boardNo; // 게시판 번호
	private String boardTitle; // 제목
	private String boardContent; // 내용
	private int boardHit; // 조회수
	
	
}