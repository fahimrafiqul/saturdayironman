package com.upskill.java_4;

public class Encapsulation {
	private String name = "upskill";
	private int ssn = 45677;
	private String username = "raselalam";
	
	
	//Setter Method = - name                 //set the data, write
	public void setName(String value){
		name = value;
	}
	//Getter Method - name      ////get the data
	public String getName(){
		return name;
		
	}
	//ssn - Setter Method               // set the data, write only
	public void setssn(int value){
		ssn = value;
	}
	
	//username - Getter method         // get the data read only
	public String getUserName(){
		return username;
	}
	
	


	
		// TODO Auto-generated method stub
       // Encapsulation used to hide the data using setter and getter method
	
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			obj.setName("Rasel");
			System.out.println(obj.getName());
			obj.setssn(45677);
			System.out.println(obj.getUserName());
			


		
		
		
		
	}

}
