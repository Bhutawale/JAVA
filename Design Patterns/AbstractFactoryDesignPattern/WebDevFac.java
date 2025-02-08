package com.DesignPattern.AbstractFactoryDesignPattern;

public class WebDevFac extends AbstractEmployeeFactory
{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}
	
}
