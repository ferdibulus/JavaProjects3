package Stackler;

import java.util.Enumeration;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.empty());
		stack.add("Java");
		stack.push("Python");
		stack.add("Hmtl");
		stack.add("Php");
		
//		for(String s: stack) {
//			System.out.println(s);
//		}
//		Enumeration<String> enumeration = stack.elements();
//		while (enumeration.hasMoreElements()) {
//			System.out.println(enumeration.nextElement());
//			
//		}
		
		//System.out.println(stack.peek());
//		System.out.println("son eleman cikariliyor -->" + stack.pop());
//		for(String s: stack) {
//			System.out.println(s);
//		}
//		System.out.println(stack.empty());
		
		while(!stack.empty()) {
			System.out.println("Eleman Cikariliyor.." + stack.pop());
		}
		//System.out.println(stack.pop());
	}

}
