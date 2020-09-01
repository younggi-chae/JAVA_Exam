package mvc.board.impl;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.board.BoardDTO;
import mvc.board.BoardService;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired  
	private BoardDAO boardDAO;

	public void insertBoard(BoardDTO dto) {
		boardDAO.insertBoard(dto);
	}

	public void updateBoard(BoardDTO dto) {
		boardDAO.updateBoard(dto);
	}

	public void deleteBoard(BoardDTO dto) {
		boardDAO.deleteBoard(dto);
	}

	public BoardDTO getBoard(BoardDTO dto) {
		return boardDAO.getBoard(dto);
	}

	public List<BoardDTO> getBoardList(BoardDTO dto) {
		return boardDAO.getBoardList(dto);
	}
}
