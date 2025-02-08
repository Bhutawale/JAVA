package com.DesignPattern.ShallowCopy;

public class Address 
{
	String city;
	String country;
	
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
}
