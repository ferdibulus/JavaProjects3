package arrayListMain;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		//ArrayList<String> arrayList = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Mysql");
		list.add("Php");
		
		for(String s:list) {
			System.out.println(s);
		}
		
		list.remove(0);
		for(String s:list) {
			System.out.println(s);
		}
	}

}
