package IdmanProgramiCreateLogFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
public static void main (String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bulus Academy ");
	
	String idmanlar = "gecerli hareketler..\n"
						+ "burpee\n"
						+ "pushup\n"
						+ "situp\n"
						+"squat";
	System.out.println(idmanlar);
	
	System.out.println("bir idman olusuturun");
	
	System.out.println("burpee sayisi:" );
	int burpee = scanner.nextInt();
	System.out.println("pushup sayisi:" );
	int pushup = scanner.nextInt();
	System.out.println("situp sayisi:" );
	int situp = scanner.nextInt();
	System.out.println("squat sayisi:" );
	int squat = scanner.nextInt();
	scanner.nextLine();
	
	idman idman = new idman(burpee, pushup, situp, squat);
	System.out.println("Idmaniniz Basliyor..");
	int i=1;
	
	try(FileWriter writer = new FileWriter("src/IdmanProgramiCreateLogFile/log.txt")){
		writer.write("Idman Programi\n");
		writer.write("Burpee sayisi: " + idman.getBurpee_sayisi() + "\n");
		writer.write("Pushup sayisi: " + idman.getPushup_sayisi() + "\n");
		writer.write("Situp sayisi: " + idman.getSitup_sayisi() + "\n");
		writer.write("Squat sayisi: " + idman.getSquat_sayisi() + "\n");
		
		
	while(idman.idmanBittimi() == false) {
		System.out.println("Hareket Turu:{Burpe-Pushup-Situp-Squat");
		String tur = scanner.nextLine();
		System.out.println("Bu hareketten kac defa yapacaksiniz:");
		int sayi = scanner.nextInt();
		scanner.nextLine();
		idman.hareketYap(tur, sayi);
		writer.write(i + " islem --------->  Hareket  :" + tur + " sayi:" + sayi + "\n");
		i++;
	}
	} catch (IOException e) {
	// TODO Auto-generated catch block
	System.out.println("");
	}
	System.out.println("Idman Basarili Bir Sekilde Bitti..");
}
}
