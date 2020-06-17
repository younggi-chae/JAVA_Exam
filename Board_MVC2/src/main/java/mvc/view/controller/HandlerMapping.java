package mvc.view.controller;

import java.util.HashMap;
import java.util.Map;

import mvc.view.board.DeleteBoardController;
import mvc.view.board.GetBoardController;
import mvc.view.board.GetBoardListController;
import mvc.view.board.InsertBoardController;
import mvc.view.board.UpdateBoardController;
import mvc.view.user.LoginController;
import mvc.view.user.LogoutController;

public class HandlerMapping {
	
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
	
}
