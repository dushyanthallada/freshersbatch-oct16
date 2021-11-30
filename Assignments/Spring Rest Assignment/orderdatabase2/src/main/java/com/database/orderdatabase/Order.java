package com.database.orderdatabase;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Order {
	@Id
	private int orderid;
	private String ordername;
	public Order(int orderid, String ordername) {
		super();
		this.orderid = orderid;
		this.ordername = ordername;
	}
	public int getOrderid() {
		return orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordername=" + ordername + "]";
	}
	
}
