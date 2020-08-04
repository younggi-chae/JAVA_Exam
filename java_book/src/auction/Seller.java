package auction;


public class Seller {
	
	private String name;
	private String phoneNo;
	private String id;
	private String pwd;
	private String address;
	
	
	
	public Seller() {}
	
	

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Seller [name=" + name + ", phoneNo=" + phoneNo + ", id=" + id + ", pwd=" + pwd + ", address=" + address
				+ "]";
	}



	public Seller(String name, String phoneNo, String id, String pwd, String address) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.id = id;
		this.pwd = pwd;
		this.address = address;
	}




}
