package com.wellsfargo.pms.dto;

import java.util.Date;

public class Company {
	private Integer company_id  ;
	private String company_name ;
	private Integer turn_over  ;
	private Integer current_price  ;
	private String sector ;
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Integer getTurn_over() {
		return turn_over;
	}
	public void setTurn_over(Integer turn_over) {
		this.turn_over = turn_over;
	}
	public Integer getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(Integer current_price) {
		this.current_price = current_price;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public Company(Integer company_id, String company_name, Integer turn_over, Integer current_price, String sector) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.turn_over = turn_over;
		this.current_price = current_price;
		this.sector = sector;
	}
	public Company(String sector) {
		super();
		this.sector = sector;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
}
