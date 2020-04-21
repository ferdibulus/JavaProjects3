package com.ferdi.UsingMultiLock;

import java.util.ArrayList;
import java.util.Random;

import com.ferdi.thread1.Printer;

public class ListWorker {
	Random random = new Random();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	
	public  void list1degerEkle() {
//		for(int i=0; i<2000; i++) {
//			list1.add(i);
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
		
	}
	public  void list2degerEkle() {
//		for(int i=0; i<2000; i++) {
//			list2.add(i);
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
		
	}
	
	public void degerAta() {
		for(int i = 0; i<1000; i++) {
			list1degerEkle();
			list2degerEkle();
		}
		
		
		
//		System.out.println("List1 :" + list1.size() + "\n" + "List2: " + list2.size());
		
		
	}
	public void Calistir() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				degerAta();
				
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				degerAta();
				
			}
		});
		long baslangic = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("List1: " + list1.size() + "\n" + "List2: " + list2.size() );
		long bitis = System.currentTimeMillis();
		System.out.println("Gecen sure: " + (bitis-baslangic));
	}
}
