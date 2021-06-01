package com.Database;

public class CarDetails {

	   private String cname;
	   private String model;
	   private String color;
	   private String brand;
	   private String company;
	   private String myear;
	   
	   public CarDetails(String cname,String model,String color,String brand,String company,String myear) {
		this.cname = cname;
		this.model = model;
		this.color = color;
		this.brand = brand;
		this.company = company;
		this.myear = myear;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMyear() {
		return myear;
	}
	public void setMyear(String myear) {
		this.myear = myear;
	}
	      
	   
}
