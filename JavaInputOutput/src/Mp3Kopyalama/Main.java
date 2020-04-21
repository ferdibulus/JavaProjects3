package Mp3Kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	private static ArrayList<Integer> icerik = new ArrayList<Integer>();
	
	public static ArrayList<Integer> dosyaoku() {
		try {
			FileInputStream in = new FileInputStream("src/Mp3Kopyalama/kalben.mp3");//Warning if you read file you should write file location correctly.
			
			
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
		 
		  long baslangic = System.currentTimeMillis();
		 Kopyala("kalben3.mp3");
		  long bitis = System.currentTimeMillis(); 
		 System.out.println("Kopyalandi:" + (bitis-baslangic)/1000 + " saniye");
		
	}
}
