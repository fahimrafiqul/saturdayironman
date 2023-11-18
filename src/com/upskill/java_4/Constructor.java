package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	String Studentname;
	int studentAge;
	
	
	
	
	
	
	
	
	public Constructor(String name){
		Studentname = name;
	   
		
	}
    public Constructor (int age){
    	studentAge = age;
    }
    public Constructor(String name, int age){
    	Studentname = name;
    	studentAge = age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor("Foyez");
		System.out.println(obj.Studentname);
		Constructor obj2 = new Constructor(30);
		System.out.println(obj2.studentAge);
		Constructor obj3 = new Constructor("Amama , 25");
		System.out.println(obj3.studentAge);
		System.out.println(obj3.studentAge);

	}

}
