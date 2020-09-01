package ex.board;

import java.sql.SQLException;
import java.util.List;
import ex.board.BoardVO;
import ex.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) throws SQLException {
		BoardDAO boardDAO = new BoardDAO();

		BoardVO vo = new BoardVO();
		vo.setTitle("myBatis 제목");
		vo.setWriter("채영기");
		vo.setContent("mybatis 내용입니다.");
		boardDAO.insertBoard(vo);

		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("--->" + board.toString());
		}

	}

}
