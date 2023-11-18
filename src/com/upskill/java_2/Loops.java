
package com.upskill.java_2;

public class Loops {
	
    
 
 
  
	
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
  	practiceforLoop(); 
   	practiceinfiniteforLoop();
   	practiceWhileLoop();
    	practicedowhileLoop();
    	practiceNestedforLoop();

	}

	private static void practiceinfiniteforLoop() {
		// TODO Auto-generated method stub
    	int i;
		for(i = 1;   ; i++){
			System.out.println("Infinite Loops number = " + i);
		}
		
	}

	public static void practiceforLoop(){  // For loop - do again and again up to upper limit
    	
    	int i;                            // initialize the variable
    	for(i=1; i<=10; i++){             // setting lower limit, upper limit, increment or decrement
    		System.out.println("For Loops number = " + i); // statement
    	}
    }

   public static void practiceWhileLoop(){
	   int i = 1;
	   while (i<=10){
		   System.out.println("while Loops number = " + i);
		   i++;
		   
		   
	   };
   }
	public static void practicedowhileLoop(){  // do while loop - do action then match condition
		int i =1;                               // initialize the variable
		
		do {
			System.out.println("Do while Loops number = " + i);                // statement
			i++;                               // Increment or decrement 
		} while (i<=0);                      // checking condition
		
		}
	public static void practiceInfiniteLoop(){
		int i;
		for(i = 1;   ; i++){
			System.out.println("Infinite Loops number = " + i);
	    	}
    	}
	
	 public static void practiceNestedforLoop(){
		 int i;
		 int j;
		 
		 for (i=1; i<=10; i++){
			 for (j=1; j<=10; j++){
				 int multiplicationTable = i * j;
				 System.out.print(multiplicationTable + " ");
			 }
			 System.out.println(" ");
		 }
			 }
		 
	 }
	
   