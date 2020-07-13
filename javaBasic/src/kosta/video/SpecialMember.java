package kosta.video;

public class SpecialMember extends GeneralMember {

	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String mName, String address, int bonusPoint) {
		super(id, mName, address);
		this.bonusPoint = bonusPoint;
	}
	
	public void print() {
		super.printMember();
		System.out.println("회원의 보너스 포인트  : " + bonusPoint);
	}
	
}
