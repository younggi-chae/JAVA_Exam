package kosta.video;

public class GeneralMember {
	
	private String id;
	private String mName;
	private String address;
	private Video rentalVideo; //객체 간 상호관계 
	
	public GeneralMember() {}

	public GeneralMember(String id, String mName, String address) {
		super();
		this.id = id;
		this.mName = mName;
		this.address = address;
	}
	
	public void printMember() {
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + mName);
		System.out.println("회원의 주소 : " + address);
		System.out.println("회원이 대여한 비디오 번호 : " + rentalVideo.getNum());
		System.out.println("회원이 대여한 비디오 제목 : " + rentalVideo.getName());
		System.out.println("회원이 대여한 비디오 배우 : " + rentalVideo.getAct());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}	
}
