package com.DesignPattern.DeepCopy;

public class Address 
{
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	public Address(Address address)
	{
		this.city=address.city;
	}
}
