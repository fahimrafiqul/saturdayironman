/**
 * 
 */
package com.upskill.assignment_2;

/**
 * @author fahim
 *
 */
public class assignment_2_5java {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        multiplicationTable();
	}

	private static void multiplicationTable() {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 10; col++) {
				int MultiplicationTable = row * col;
				System.out.println(MultiplicationTable + " ");
				
			}
			System.out.println("");
		}
		
	}

}
