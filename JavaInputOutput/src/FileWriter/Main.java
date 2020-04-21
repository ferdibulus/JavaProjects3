package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
public static void main(String args[]) {
	FileWriter writer = null;
	
    try {
		writer = new FileWriter("src/FileWriter/dosya.txt",true);
//		writer.write("ferdi bulus\n");
//		writer.write("erdi bulus\n");
		writer.write("eymen uras\n");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Dosya acilirken IOException olustu.");
	}
    finally{
    	if(writer !=null) {
    		try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Dosya kapatilirken bir hata olustu..");
			}
    	}
    }
	
}
}
