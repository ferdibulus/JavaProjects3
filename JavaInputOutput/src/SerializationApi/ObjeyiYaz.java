 package SerializationApi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
	public static void main(String args[]) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/SerializationApi/ogrenci.bin"))){
			Ogrenci ogrenci1 = new Ogrenci("ferdi", 1234, "yazilimci");
			Ogrenci ogrenci2 = new Ogrenci("erdi", 12345, "malzemeci");
			out.writeObject(ogrenci1 + "\n");
			out.writeObject(ogrenci2 + "\n");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Dosya bulunamadi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Dosya acilirken bir sorun olustu..");
		}
		
	}
}	
