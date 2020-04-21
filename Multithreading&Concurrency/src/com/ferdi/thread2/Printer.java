package com.ferdi.thread2;

public class Printer implements Runnable{
	private String isim;

	public Printer(String isim) {
		
		this.isim = isim;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(isim + " calisiyor..");
		for(int i = 1; i<=10; i++) {
			System.out.println(isim + " yaziyor :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread kesintiye ugradi");
			}
		}
		System.out.println(isim + " isini bitirdi.");
	}
	

}
