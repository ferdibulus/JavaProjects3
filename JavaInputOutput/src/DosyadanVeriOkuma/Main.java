package DosyadanVeriOkuma;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
		  fis = new FileInputStream("Dosya.txt");
		 
//			System.out.println("Okunan Birinci karakter:" + (char)fis.read());
//			System.out.println("Okunan Ikinci karakter:" + (char)fis.read());
//		  fis.skip(5);
//		  System.out.println("Okunan karakter:" +(char) fis.read());
		  
		  int deger;
		  String s= "";
		  
		  int say = 0;
		  fis.skip(5);
		  
		  while((deger = fis.read()) != -1) {
			  s+= (char) deger;
			  say++;
			  if(say == 11) {
				  break;
			  }
		  }
		  System.out.println("Dosyanin 5. yerinden itibaren 10 karakter: " + s);
//		  while((deger = fis.read()) != -1) {
//			  s += (char) deger;
//			  
//		  }
//		  System.out.println("Okunan karakterler:" +s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File bulunmadi");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(fis !=null) {
				fis.close();
				}
			}
			catch (IOException e) {
				// TODO: handle exception
				System.out.println("Dosya kapatilirken bir hata olustu..");
			}
		}
	}

}
