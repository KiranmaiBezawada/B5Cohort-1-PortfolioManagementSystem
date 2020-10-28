package com.wellsfargo.pms.dto;

import java.util.Date;

public class UserDetails {
	private Integer user_id ;
	private String first_name ;
	private String last_name ;
	private double mobile_number ;
	private Date register_date;
	private String role ;
	public UserDetails(Integer user_id, String first_name, String last_name, double mobile_number, Date register_date,
			String role) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
		this.register_date = register_date;
		this.role = role;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(double mobile_number) {
		this.mobile_number = mobile_number;
	}
	public Date getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
