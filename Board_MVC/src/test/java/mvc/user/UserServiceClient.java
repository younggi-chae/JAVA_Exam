package mvc.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
				
		// 2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup 한다.
		UserService userService = (UserService) container.getBean("userService");
				
		// 3. 로그인 기능 테스트
		UserDTO dto = new UserDTO();
		dto.setId("test");
		dto.setPassword("test123");
		 
		UserDTO user = userService.getUser(dto);
		if(user != null) {
			System.out.println(user.getName() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
		container.close();
	}

}
