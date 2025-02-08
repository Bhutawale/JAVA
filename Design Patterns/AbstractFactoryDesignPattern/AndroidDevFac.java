package com.DesignPattern.AbstractFactoryDesignPattern;

public class AndroidDevFac extends AbstractEmployeeFactory
{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
