package com.upskill.java_5;

public class myException extends Exception {
      String a ;
      public myException (String b){
    	  a=b;
    	  try{
  			throw new myException("Test");
  		} catch (Exception e){
  			e.printStackTrace();
  			System.out.println("this is user-defined exception method !");
  		}

      }
}
