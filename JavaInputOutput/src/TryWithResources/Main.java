package TryWithResources;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String args[]) {
		//Otomatik olarak dosya kapanir try with resources kullanilirsa
//		try(FileWriter writer = new FileWriter("src/TryWithResources/dosya.txt");
//		FileWriter writer1 = new FileWriter("src/TryWithResources/dosya1.txt")	
//				){
	
	try(FileWriter writer = new FileWriter("src/TryWithResources/diller.txt",true)) {
			Scanner scanner = new  Scanner(System.in);
			String dil;
			while(true) {
				System.out.println("Bir dil giriniz:");
				dil = scanner.nextLine();
					
				
				if(dil.equals("-1")) {
					System.out.println("Programdan Cikiliyor");
					System.out.println("Dosyayi kontrol edin");
					break;
				}
				writer.write(dil + "\n");
				
			}
				
			
			//writer1.write("deneme1");
			}
			catch (IOException e) {
			// TODO Auto-generated catch block
		System.out.println("Dosya olusturulurken hata olustu..");
		}
	
}
}
