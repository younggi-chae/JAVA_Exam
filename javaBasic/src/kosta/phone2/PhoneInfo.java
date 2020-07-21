package kosta.phone2;

public class PhoneInfo {
	//클래스 : PhoneInfo
	//1인 전화번호 내역 => 객체(상태/형동)
	//상태 : 이름, 전화번호, 생년월일
	//기능 : 1인 전화내역 출력기능, 
	
	//Main : 프로그램 시작
	//추가, 출력, 검색 => 메뉴 선택  
	
	//Manager : 추가 출력, 검색 => 기능구현
	private String name;
	private String phoneNo;
	private String birth;
	
	public PhoneInfo() {}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}	

	public PhoneInfo(String name) {
		this.name = name;
	}

	//기능 : 1명의 전화내역 출력
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("생년월일 : " + birth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
