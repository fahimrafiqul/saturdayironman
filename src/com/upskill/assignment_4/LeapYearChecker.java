package com.upskill.assignment_4;

public class LeapYearChecker {
	 public static boolean isLeapYear(int year) {
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int yearToCheck = 2024;
	        if (isLeapYear(yearToCheck)) {
	            System.out.println(yearToCheck + " is a leap year.");
	        } else {
	            System.out.println(yearToCheck + " is not a leap year.");
	        }

	}

}
