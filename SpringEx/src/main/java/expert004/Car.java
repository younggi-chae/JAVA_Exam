package expert004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("tire1")   // id값 지정 어노테이션, Autowired와 협업
	Tire tire;
	
		
	public String getTireBrand() {
		return "장찰된 타이어 : " + tire.getBrand();
	}
		
}
