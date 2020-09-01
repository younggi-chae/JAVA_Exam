package models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Member {
	private long id;
	private String username;
	private String password;
	private String realname;
	private String email;
	private String phone;
	private Timestamp createDate;

	public Member() {

	}

	public Member(long id, String username, String password, String realname, String email, String phone,
			Timestamp createDate) {
		this.id = id;
		this.username = username;
		this.password = password; 
		this.realname = realname;
		this.email = email;
		this.phone = phone;
		this.createDate = createDate;
	}

	public long getId() { 
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return realname;
	}

	public void setName(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

}
