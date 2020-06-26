package mvc.board;

import java.util.List;

import mvc.common.Search;

public interface BoardService {

	//글등록
	void insertBoard(BoardDTO dto); 

	//글수정   
	void updateBoard(BoardDTO dto);
	
	//글삭제
	void deleteBoard(BoardDTO dto);

	//글상세 조회
	BoardDTO getBoard(BoardDTO dto);

	//글 목록 조회
	List<BoardDTO> getBoardList(Search search);
	
	//글 조회수 
	void updateCnt(BoardDTO dto);
	
	int getBoardListCnt(Search search);
}