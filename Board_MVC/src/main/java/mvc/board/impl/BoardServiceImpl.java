package mvc.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import mvc.board.BoardDTO;
import mvc.board.BoardService;
import mvc.board.ReplyDTO;
import mvc.common.Search;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired   
	private BoardDAOMybatis boardDAO; 
 
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

	public List<BoardDTO> getBoardList(Search search) {
		return boardDAO.getBoardList(search);
	}
	
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public void updateCnt(BoardDTO dto) {
		boardDAO.updateCnt(dto);	
	}
	
	public int getBoardListCnt(Search search) {
		return boardDAO.getBoardListCnt(search);
	}		
	
	public List<ReplyDTO> getReplyList(int bid) {
		return boardDAO.getReplyList(bid);
	}

	public int saveReply(ReplyDTO replyDTO)  {
		return boardDAO.saveReply(replyDTO);
	}

	public int updateReply(ReplyDTO replyDTO) {
		return boardDAO.updateReply(replyDTO);
	}

	public int deleteReply(int rid) {
		return boardDAO.deleteReply(rid);
	}		
}
