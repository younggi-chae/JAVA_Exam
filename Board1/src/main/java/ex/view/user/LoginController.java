package ex.view.user;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import ex.user.UserVO;
import ex.user.impl.UserDAO;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("test");
		vo.setPassword("test1234");
		return "login.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession sesstion) {
		if (vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		System.out.println("로그인 인증 처리");
		UserVO user = userDAO.getUser(vo);
		if (user != null) {
			sesstion.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}

		else
			return "login.jsp";

		// 1. 사용자 입력 정보 추출
		// String id = request.getParameter("id");
		// String password = request.getParameter("password");

		// 2. db연동 처리
		// UserVO vo = new UserVO();
		// vo.setId(id);
		// vo.setPassword(password);

		// UserDAO userDAO = new UserDAO();
		// UserVO user = userDAO.getUser(vo);

		// 3. 화면 네이게이션
		// ModelAndView mav = new ModelAndView();
		// if(user != null){
		// mav.setViewName("redirect:getBoardList.do");
		// } else {
		// mav.setViewName("redirect:login.jsp");
		// }
		// return mav;
	}

}
