package com.upskill.java_6;

public class Singleton {
  // Singleton is class that can have only one object
	// private constructor, it prevents any other class from instantiating
	
	private Singleton(){
}
	   //private static object of the class
	private static Singleton Singletonobj = new Singleton();
	public static Singleton getInstance(){
		return Singletonobj;
	}
	protected static void demo1(){
		System.out.println("Demo 1 method for singleton class");
	}
		protected static void demo2(){
			System.out.println("Demo 2 method for singleton class");
		}
			protected static void demo3(){
				System.out.println("Demo 3 method for singleton class");
				
			
		}
		
	

 //git changes
// changes for git pull request practice
    protected static void demo4(){
    	System.out.println ("Demo iiii method for singleton class");
    }

}