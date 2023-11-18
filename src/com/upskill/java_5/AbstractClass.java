package com.upskill.java_5;

public abstract class AbstractClass {

	public abstract void iDoor();
	public abstract String iEngine();
	 
	 public abstract int iWheel();
	 public abstract String iColor();
	 public void car(){
		 System.out.println("My Car is Audi");
	
	}

	}


/*
(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)
						
Class						extends					 Class		 
Abstract Class (+2)  		extends					 Class (-2=0)
Interface (+2)			  implements				 Class (-2=0)
Interface (+2)				 extends				Interface (+2+2=+4)    implements				Class(-4=0)

*/