package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String args[]) {
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	hashMap.put(1, "Java");
	hashMap.put(10, "Python");
	hashMap.put(40, "php");
	hashMap.put(20, "html");
	hashMap.put(5, "php");
	hashMap.put(40, "js");
//	System.out.println(hashMap);
//	System.out.println(hashMap.get(40));
	for(Map.Entry<Integer,String> entry: hashMap.entrySet()) {
		System.out.println("Anahtar:" +entry.getKey() + " Deger:"  + entry.getValue() );
	}
}
}
