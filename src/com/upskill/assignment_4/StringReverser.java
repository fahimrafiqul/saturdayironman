package com.upskill.assignment_4;

public class StringReverser {

	
	    public static String reverseString(String input) {
	        // Convert the input string to a character array
	        char[] charArray = input.toCharArray();

	        // Initialize pointers for the start and end of the character array
	        int start = 0;
	        int end = charArray.length - 1;

	        // Reverse the string by swapping characters from the start and end
	        while (start < end) {
	            char temp = charArray[start];
	            charArray[start] = charArray[end];
	            charArray[end] = temp;
	            start++;
	            end--;
	        }

	        // Convert the character array back to a string
	        return new String(charArray);
	    }

	    public static void main(String[] args) {
	        String original = "Hello, World!";
	        String reversed = reverseString(original);
         
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }
	}	

	


