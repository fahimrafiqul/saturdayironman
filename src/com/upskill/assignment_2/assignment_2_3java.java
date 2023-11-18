/**
 * 
 */
package com.upskill.assignment_2;

/**
 * @author fahim
 *
 */
public class assignment_2_3java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareNumbers();
		
		

	}
    public static int myFunction1(){
		int a=34;
		return a;
    	
    }
    public static int myFunction2(){
		int b=30;
		return b;
    	
    }
	public static void compareNumbers() {
		// TODO Auto-generated method stub
		if (myFunction1()>myFunction2()){
			System.out.println("1st Function is bigger then 2nd Function");}
		else if (myFunction1()==myFunction2()){ 
			System.out.println("Both Function has the same value");}
		else {
			System.out.println("2nd Function is bigger then 1st Function");}
			
			
		}
	}


