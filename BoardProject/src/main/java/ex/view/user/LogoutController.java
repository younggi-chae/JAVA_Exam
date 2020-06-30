package ex.view.user;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LogoutController {
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리");
		session.invalidate();
		return "login.jsp";
		
				
		 //1.브라우저와 연결된 세션 객체를 강제 종료
	    //HttpSession session = request.getSession();
		//session.invalidate();

	    //2.세션 종료 후, 메인 화면으로 이동한다.
	    //ModelAndView mav = new ModelAndView();
	   // mav.setViewName("redirect:login.jsp");
	   // return mav;
		
		//return "login";
	}

}
