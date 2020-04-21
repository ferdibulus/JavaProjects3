package com.ferdi.thread2;

import com.ferdi.thread1.Printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread printer1 = new Thread(new Printer("Printer1"));
		Thread printer2 = new Thread(new Printer("Printer2"));
		
		printer1.start();
		printer2.start();
		System.out.println("Main thread calisiyor..");
	}

}
