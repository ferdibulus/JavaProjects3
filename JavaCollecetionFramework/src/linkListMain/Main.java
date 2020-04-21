package linkListMain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		zamanHesapla("Linklist", linkedList);
		zamanHesapla("Arraylist", arrayList);
	}
	public static void zamanHesapla(String veri_tipi,List<Integer> list) {
		//Listin sonuna deger ekleme
		long baslangic;
		long bitis;
		baslangic=System.currentTimeMillis();
		for(int i = 0; i<1000000; i++) {
			list.add(0,i);
		}
		bitis=System.currentTimeMillis();
		System.out.println(veri_tipi + " ekleme suresi:" + (bitis - baslangic) + " msec.");
	}

}
