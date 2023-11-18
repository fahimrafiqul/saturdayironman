package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		// TODO Auto-generated method stub
		System.out.println("My car has 4 door");
		
	}

	@Override
	public String iEngine() {
System.out.println("My car has dual motor engine");
		return "dual motor";
	}

	@Override
	public int iWheel() {
System.out.println("My car has 4 wheel");
		return 4;
	}

	@Override
	public String iColor() {
		System.out.println("my car is red");
	return "red";
	  
	}
}

