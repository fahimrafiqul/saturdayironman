package com.upskill.java_6;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n = 5;
 for (int i = 0; i< n; i++){
	 MultithreadingThread obj = new MultithreadingThread();
	 
	 obj.start();
	 Thread obj2 = new Thread(new MultiThreadingRunnable());
	 obj2.start();
 }
	}

}
