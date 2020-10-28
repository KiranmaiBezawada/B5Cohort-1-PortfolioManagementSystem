package com.wellsfargo.lms.dto;

import java.util.Date;

public class Book {
	private Integer bookcode ;
	private String title ;
	private double price ;
	private Date publish_date;
	private String category ;
	public Book(Integer bookcode, String title, double price, Date publish_date, String category) {
		super();
		this.bookcode = bookcode;
		this.title = title;
		this.price = price;
		this.publish_date = publish_date;
		this.category = category;
	}
	public Integer getBookcode() {
		return bookcode;
	}
	public void setBookcode(Integer bookcode) {
		this.bookcode = bookcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
