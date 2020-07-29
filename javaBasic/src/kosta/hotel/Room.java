package kosta.hotel;

public class Room {
	
	private String roomGrade;
	private int price;
	private int maxPeople;
	private int roomNo;
	public Room() {
		
	}

	public Room(String roomGrade, int price, int maxPeople) {
		super();
		this.roomGrade = roomGrade;
		this.price = price;
		this.maxPeople = maxPeople;
	}

	public String getRoomGrade() {
		return roomGrade;
	}

	public void setRoomGrade(String roomGrade) {
		this.roomGrade = roomGrade;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxPeople() {
		return maxPeople;
	}

	public void setMaxPeople(int maxPeople) {
		this.maxPeople = maxPeople;
	}	

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public void show() {
		System.out.println("객실 : " + getRoomGrade());
	    System.out.println("가격 : " + getPrice());
		System.out.println("최대인원 : " + getMaxPeople());
		
	}	
	
}