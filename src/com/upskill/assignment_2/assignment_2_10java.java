/**
 * 
 */
package com.upskill.assignment_2;

import java.util.Scanner;

/**
 * @author fahim
 *
 */
public class assignment_2_10java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      convertTemp();
	}

	private static void convertTemp() {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		double farn, cels;
		System.out.println("Enter Farenheit Temperature = ");
		farn = input.nextDouble();
		cels = (farn -32)*5/9;
		System.out.println("So in Celsious : "+ cels);
		
	}

}
