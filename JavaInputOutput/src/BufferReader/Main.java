package BufferReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try(FileWriter  writer = new FileWriter("src/FileReaderBufferReaderBufferWriter/students.txt")){
//			int i=1;
//			String student;
//			while(true) {
//				
//				Scanner scanner = new Scanner(System.in);
//				System.out.print("Bir Ogrenci Giriniz:");
//				student = scanner.nextLine();
//				if(student.equals("-1")) {
//					break;
//				}
//				writer.write(i + ".ogrenci : "+ student + "\n");
//				i++;
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Dosya acilirken  bir hata oldu.");
//		}
			//Okuma bolumu
		//Bir karakter okuyup geri geliyor bu sebeble BufferReader(Kume olusturuyor dosyadaki \n gorene kadar hepsini kumeye koyuyor.) 
		//daha iyi cunku hardiske gidip gelmiyoruz bu sebeple.
		//try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/BufferReader/students.txt")))){

//	
//			
//		while(scanner.hasNextLine()) {
//			   
//			  String ogrenci_bilgisi = scanner.nextLine();
//			  String[] array =ogrenci_bilgisi.split(",");
//			  if(array[1].equals("Computer Science")) {
//			  System.out.println("Ogrenci Bilgisi:" + ogrenci_bilgisi);
//			  }
//		   }
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Dosya Bulunamadi...");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Dosya acilirken bir hata oldu.");
//		}
		
		//BufferedWriter
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/BufferReader/students.txt",true))){
			writer.write("Ali Ozan,Insaat Muhendisligi\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dosya acma sirasinda bir problem oldu..");
		}
		
	
	}

}