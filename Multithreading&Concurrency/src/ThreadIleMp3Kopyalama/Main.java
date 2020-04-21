package ThreadIleMp3Kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Integer> icerik = new ArrayList<Integer>();
	
	public static ArrayList<Integer> dosyaoku() {
		try {
			FileInputStream in = new FileInputStream("src/ThreadIleMp3Kopyalama/kalben.mp3");//Warning if you read file you should write file location correctly.
			
			
			int oku ;
			while((oku = in.read()) != -1 ) {
				icerik.add(oku);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return icerik;
		
	}
	
	public static void Kopyala(String dosyaismi) {
		try {
			FileOutputStream out = new FileOutputStream(dosyaismi);
			
			for(int deger : icerik) {
			   out.write(deger);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  dosyaoku();
		 
		 
		  Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
					Kopyala("kalben1.mp3");
			}
		});
		  
		  Thread thread2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					 Kopyala("kalben2.mp3");
				}
			});
			  
		  Thread thread3 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Kopyala("kalben3.mp3");
				}
			});
		  long baslangic = System.currentTimeMillis();
		  thread1.start();
		  thread2.start();
		  thread3.start();
		  
		  try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  long bitis = System.currentTimeMillis(); 
			 System.out.println("Kopyalandi:" + (bitis-baslangic)/1000 + " saniye");
	 
		  
		
	}
}
