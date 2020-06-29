package mvc.view.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mvc.board.BoardService;
import mvc.board.ReplyDTO;

@RestController
@RequestMapping("/restBoard")
public class RestBoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/getReplyList.do", method = RequestMethod.POST)
	public List<ReplyDTO> getReplyList(@RequestParam(required=false, defaultValue="1") int seq) {
		return boardService.getReplyList(seq);
	}

	@RequestMapping(value = "/saveReply.do", method = RequestMethod.POST)
	public Map<String, Object> saveReply(@RequestBody ReplyDTO replyDTO) {
		Map<String, Object> result = new HashMap<>();
		try {
			boardService.saveReply(replyDTO);
			result.put("status", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", HttpStatus.BAD_REQUEST);
		}
		return result;
	}

	@RequestMapping(value = "/updateReply.do", method = { RequestMethod.GET, RequestMethod.POST })
	public Map<String, Object> updateReply(@RequestBody ReplyDTO replyDTO) {
		Map<String, Object> result = new HashMap<>();
		try {
			boardService.updateReply(replyDTO);
			result.put("status", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", HttpStatus.BAD_REQUEST);
		}
		return result;
	}

	@RequestMapping(value = "/deleteReply.do", method = { RequestMethod.GET, RequestMethod.POST })
	public Map<String, Object> deleteReply(@RequestParam(required=false, defaultValue="1") int rid) {
		Map<String, Object> result = new HashMap<>();
		try {
			boardService.deleteReply(rid);
			result.put("status", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", HttpStatus.BAD_REQUEST);
		}
		return result;
	}
}