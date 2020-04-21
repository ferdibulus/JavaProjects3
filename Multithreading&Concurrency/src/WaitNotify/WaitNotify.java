package WaitNotify;

import java.util.Scanner;

public class WaitNotify {
	private Object lock = new Object();
	public void thread1Fonksiyonu() {
		synchronized (lock) {
			System.out.println("Thread1 Calisiyor...");
			System.out.println("Thread1 Thread2'nin kendisini uyandirmasini bekliyor...");
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread1 uyandi. devam ediyor..");
		}
	}
	
	public void thread2Fonksiyonu() {
		Scanner scanner = new Scanner(System.in);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (lock) {
				System.out.println("Thread2 calisiyor.");
				System.out.println("Devam etmek icin bir tusa basiniz..");
				scanner.nextLine();
				
				lock.notify();//ile uyandirmak gerekiyor waiti.
				System.out.println("Uyandirildi Thread1 ben gidiyorum.2 saniye bekle..");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
