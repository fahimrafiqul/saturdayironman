/**
 * 
 */
package com.upskill.assignment_2;

/**
 * @author fahim
 *
 */
public class assignment_2_6java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         primeNumber();
	}

	public static void primeNumber() {
		int upperbound = 100;
		for (int number =2; number <= upperbound; ++number) {
			int maxFactor = (int) Math.sqrt(number);
			boolean isPrime = true;
			int factor = 2;
			while (isPrime && factor <= maxFactor) {
				if (number % factor == 0) {
					isPrime = false;
					
				}
				++factor;
			}
			if (isPrime)
				System.out.println(number + "is a prime");
		}
		
	}

}
