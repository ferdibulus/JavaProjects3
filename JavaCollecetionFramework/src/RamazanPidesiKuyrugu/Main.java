
package RamazanPidesiKuyrugu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Pide Kuyrugu");
		Queue<String> pide_kuyrugu = new LinkedList<String>();
		Random random = new Random();
		pide_kuyrugu.offer("ferdi");
		pide_kuyrugu.offer("erdi");
		pide_kuyrugu.offer("emir");
		pide_kuyrugu.offer("abdullah");
		pide_kuyrugu.offer("eymen uras");
		pide_kuyrugu.offer("ayse");
		pide_kuyrugu.offer("basak");
		pide_kuyrugu.offer("yahya");
		pide_kuyrugu.offer("mustafa");
		pide_kuyrugu.offer("huseyin");
		
		int pide_sayisi = 1+random.nextInt(10);
		
		System.out.println("Pideler cikiyor");
		System.out.println("Cikan pide sayisi:" + pide_sayisi);
		Thread.sleep(3000);
		
		while(pide_sayisi != 0) {
			System.out.println(pide_kuyrugu.poll() + " pideyi aldi");
			pide_sayisi--;
			Thread.sleep(3000);
		}
		
		System.out.println("Pide kalmadi..");
		
	}

}