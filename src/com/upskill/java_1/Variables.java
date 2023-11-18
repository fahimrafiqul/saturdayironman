package com.upskill.java_1;

public class Variables {
	
    // Variables in Java
	
	// Instance or global variable - Variables declared in class level, outside method
	
	// Local Variables - Variables declared in methods
	
	// Static variables - Variables belong to class and don't required creating object
	
	// Method parameter - variables used as method parameter
	
  public String country = "USA";  // Instance or global variable - Variables declared in class level, outside method
		  
  public static String region = "North America"; // Static variable - variables belong to class and don't required creating object
  
  public static void main(String[]args){
	  
	  String city = "New York";
			  
	  String police = "NYPD";
	  
	  System.out.println(city);
	  System.out.println(region);
	  nj("essex");
	  pa("bensalem");
	  Variables obj = new Variables();
	  System.out.println(obj.country);
	     
  }

		

	
    public static void nj(String county){ // Method parameter - variables used as method parameter
    	
       String city = "Bloomfield";   // Local Variables - variables declared in methods
    		   
       String police = "BPD";
       
       System.out.println(city);
       System.out.println(police);
       System.out.println(county);
       
       
    }
    
    public static void pa(String county){
    	
       String city = "Phili";
    			
       String police = "PPD";
       
       System.out.println(city);
       System.out.println(police);
       System.out.println(county);
    }
}
