package mvc.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;

@Controller
public class BoardController {

	// 글등록
	@RequestMapping(value = "/insertBoard.do")
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
	public ModelAndView getBoard(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav) {

		System.out.println("글 상세 조회 처리");

		mav.addObject("board", boardDAO.getBoard(dto));
		mav.setViewName("getBoard.jsp");
		return mav;
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav) {

		System.out.println("글 목록 검색 처리");

		mav.addObject("boardList", boardDAO.getBoard(dto)); // 모델 정보 저장
		mav.setViewName("getBoardList.jsp"); // 뷰 정보 저장
		return mav;
	}
}
