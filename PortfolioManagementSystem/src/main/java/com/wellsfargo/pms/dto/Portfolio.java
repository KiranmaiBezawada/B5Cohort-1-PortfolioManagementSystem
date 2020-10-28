package com.wellsfargo.pms.dto;

import java.util.Date;

public class Portfolio {
	private Integer purchased_quantity ;
	private Integer sell_quantity;
	private Integer net_quantity;
	private Integer commodity_code;
	private Integer commodity_value;
	public Integer getPurchased_quantity() {
		return purchased_quantity;
	}
	public void setPurchased_quantity(Integer purchased_quantity) {
		this.purchased_quantity = purchased_quantity;
	}
	public Integer getSell_quantity() {
		return sell_quantity;
	}
	public void setSell_quantity(Integer sell_quantity) {
		this.sell_quantity = sell_quantity;
	}
	public Integer getNet_quantity() {
		return net_quantity;
	}
	public void setNet_quantity(Integer net_quantity) {
		this.net_quantity = net_quantity;
	}
	public Integer getCommodity_code() {
		return commodity_code;
	}
	public void setCommodity_code(Integer commodity_code) {
		this.commodity_code = commodity_code;
	}
	public Integer getCommodity_value() {
		return commodity_value;
	}
	public void setCommodity_value(Integer commodity_value) {
		this.commodity_value = commodity_value;
	}
	public Portfolio(Integer purchased_quantity, Integer sell_quantity, Integer net_quantity, Integer commodity_code,
			Integer commodity_value) {
		super();
		this.purchased_quantity = purchased_quantity;
		this.sell_quantity = sell_quantity;
		this.net_quantity = net_quantity;
		this.commodity_code = commodity_code;
		this.commodity_value = commodity_value;
	}
	public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}
}
