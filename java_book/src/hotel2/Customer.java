package hotel2;

public class Customer {

	private String name;
	private String tel;
	private String birth;		
	private Room room;
	private int reNo;
	public Customer() {}

	public Customer(String name, String tel, String birth, int reNo , Room room) {
		super();
		this.name = name;
		this.tel = tel;
		this.birth = birth;	
		this.reNo = reNo;
		this.room = room;
	}
	
	public void show() {
		System.out.println("성함 : " + name);
		System.out.println("연락처 : " + tel);
		System.out.println("생년월일 : " + birth);
		System.out.println("예약번호 : " + reNo);
		System.out.println("객실 : " + room.getGrade());
		System.out.println("가격 : " + room.getPrice() + "원");
		System.out.println("최대인원 : " + room.getMaxPeople() + "명");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}	

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getReNo() {
		return reNo;
	}

	public void setReNo(int reNo) {
		this.reNo = reNo;
	}	
	
	
}
