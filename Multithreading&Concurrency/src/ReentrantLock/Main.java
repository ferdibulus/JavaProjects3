package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

import com.ferdi.thread1.Printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLockOrnegi re = new ReentrantLockOrnegi();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				re.thread1Fonksiyon();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				re.thread2Fonksiyon();
				
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		re.threadOver();
	}

}
