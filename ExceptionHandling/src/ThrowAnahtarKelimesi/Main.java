package ThrowAnahtarKelimesi;

import java.util.Scanner;

public class Main {
	
		public static void mekanKontrol(int yas) {
			if(yas<18) {
				throw new ArithmeticException();
			}
			else {
				System.out.println("Mekana hosgeldiniz..");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz:");
		int yas = scan.nextInt();
		try {
		mekanKontrol(yas);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("18 yasinda kucukler mekana giremez..");
		}
		System.out.println("Burasi calisiyor");
		
		
		
		
		
		
	}

}
