package mvc.view.board;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;

@Controller
public class BoardController {

		
	// 글등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDTO dto, BoardDAO boardDAO) {

		System.out.println("글 등록 처리");

		boardDAO.insertBoard(dto);
		return "getBoardList.do";
	}
 
	// 글수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardDTO dto, BoardDAO boardDAO) {

		System.out.println("글 수정 처리");

		boardDAO.updateBoard(dto);
		return "getBoardList.do";
	}

	// 글삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardDTO dto, BoardDAO boardDAO) {

		System.out.println("글 삭제 처리");
		boardDAO.deleteBoard(dto);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDTO dto, BoardDAO boardDAO, Model model) {

		System.out.println("글 상세 조회 처리");
		
		model.addAttribute("board", boardDAO.getBoard(dto));
		return "getBoard.jsp";
		
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardDTO dto, BoardDAO boardDAO, Model model) {

		System.out.println("글 목록 검색 처리");

		model.addAttribute("boardList", boardDAO.getBoardList(dto));
		return "getBoardList.jsp";
	}
}
