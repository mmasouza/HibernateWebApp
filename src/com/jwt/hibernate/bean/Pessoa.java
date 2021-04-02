package com.jwt.hibernate.bean;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String userName;
	private String password;
	private String email;
	private String phone;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", city=" + city + "]";
	}
	
	

}
