package com.wellsfargo.batch5.fmvc.model;

public class RegisterUser {
	private String firstName;
	private String SecondName;
	private Integer Pan;
	private Integer mobile;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	public Integer getPan() {
		return Pan;
	}
	public void setPan(Integer pan) {
		Pan = pan;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	public RegisterUser(String firstName, String secondName, Integer pan, Integer mobile) {
		super();
		this.firstName = firstName;
		SecondName = secondName;
		Pan = pan;
		this.mobile = mobile;
	}
	public RegisterUser() {
		super();
		// TODO Auto-generated constructor stub
	}

}
