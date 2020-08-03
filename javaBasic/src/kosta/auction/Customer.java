package kosta.auction;

public class Customer {

	private String id;
	private String password;
	private String name;
	private String phoneNo;
	private String address;
	private int bid;
	
	public Customer() {}

	public Customer(String id, String password, String name, String phoneNo, String address, int bid) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.bid = bid;
	}
	
	public Customer(int bid) {
		this.bid = bid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", password=" + password + ", name=" + name + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", bid=" + bid + "]";
	}


	
	
}
