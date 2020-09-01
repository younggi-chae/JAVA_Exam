package mvc.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.user.UserDTO;
import mvc.user.impl.UserDAO;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(UserDTO dto) {
		System.out.println("로그인 화면으로 이동");
		dto.setId("test");
		dto.setPassword("test123");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserDTO dto, UserDAO userDAO) {
		
		System.out.println("로그인 인증 처리");
		
		if(userDAO.getUser(dto) != null) return "getBoardList.do";
		else return "login.jsp";
		
	}
}
