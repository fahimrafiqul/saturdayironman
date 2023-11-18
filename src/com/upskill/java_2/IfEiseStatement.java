
 
package com.upskill.java_2; 

class IfEiseStatement {
	
	public static void main(String[] args) {
		
		int age = 100;
		if (age <= 13){
			System.out.println( "You are children");
			
		} else if (age > 13 && age <18){
			System.out.println("You are Teenager");
	
			if (age >= 100){
				System.out.println("You are a Champion");
			}
		} else if (age>=60){
			System.out.println("You are a senior");
		} else if (age <60 && age >13){
			System.out.println( "You are adults");
		}

	}

}
