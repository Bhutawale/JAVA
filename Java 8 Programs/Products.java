package com.Java_8_Programs;

public class Products
{
	private int id;
	private String subject;
	private String catagory;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Products(int id, String subject, String catagory, int price) {
		super();
		this.id = id;
		this.subject = subject;
		this.catagory = catagory;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", subject=" + subject + ", catagory=" + catagory + ", price=" + price + "]";
	}
	
	
}
