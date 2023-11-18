/**
 * 
 */
package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author fahim
 *
 */
public class Array_Hashmap_Hashset_Hashtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int name = 30;                                  //Variable
		int[] ageIronMan = new int[]{25, 32, 37, 21, 27}; //Array
       //Array index                 [0] [1] [2] [3] [4]
	   System.out.println("Student Age : " + ageIronMan[2]);
	   System.out.println("Total Student: "+ ageIronMan.length);
	   String[] nameIronMan = new String[]{"Yusuf","ABD", "Madan", "Sumai", "Jannatul"};
			   System.out.println("Student Name : " + nameIronMan[3]);
			   System.out.println("Total Student Name: " + nameIronMan.length);
	 //Multi-Dimensional Array
			   int [][] ageIronMan2D = {{25, 32, 37, 21, 27, 32}, //[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
					                                               
					   {26, 30, 33, 28}};                  //[1][0] [1][1] [1][2] [1][3]
			   System.out.println("Student Age 2D : " + ageIronMan2D[1][0]);
			   // Hashmap store multiple data using key-value pair, Implementation of Map interface
			   
			   HashMap<String, Integer> Student = new HashMap<String, Integer>();
			   
			   Student.put("yusuf", 28);
			   Student.put("Abd", 22);
			   Student.put("Mdan", 32);
			   Student.put("Jannat", 24);
			   Student.put("fahim", 23);
			   System.out.println("HashMap Student Age : " + Student.get("fahim"));
			   
			   HashMap<String, String> Capital = new HashMap<String, String>();
			   Capital.put("BD","DHAKA");
			   Capital.put("usa","dc");	
			   System.out.println("Capital : " +Capital.get("USA"));
			   //Hashset store unordered collection containing unique value, Implementation of set interface
			   
			   	HashSet<String> car = new HashSet<String>();
			   	
			   	car.add("BMW");
			   	car.add("toyota");
			   	car.add("tesla");
			   	car.add("audi");
			   	System.out.println("Car : " + car);
			   	
			   	// HashTABLE Store multiple data using key value pair, No duplicate,
			   	// also is synchronized (only one thread can be modified)
			   	Hashtable<String, String> Region = new Hashtable<String, String>();
			   	Region.put("bd", "Asia");
			   	Region.put("USA", "America");
			   	System.out.println("Region : " + Region.get("BD"));
			   	
			   }
	   
	   }
	

