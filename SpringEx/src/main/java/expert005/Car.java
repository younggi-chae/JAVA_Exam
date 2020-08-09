package expert005;

import javax.annotation.Resource;

public class Car {

	@Resource(name="tire")
	Tire tire;

	public String getTireBrand() {
		return "장찰된 타이어 : " + tire.getBrand();
	}

}
