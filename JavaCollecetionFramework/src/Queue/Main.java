package Queue;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Main {

	public static void main(String[] args) {
	  Queue<String> queue = new LinkedList<String>();
	  queue.offer("Java");
	  queue.offer("php");
	  queue.offer("html");
	  queue.offer("css");
	  
	  //System.out.println(queue.peek());
	  for(String s: queue) {
		  System.out.println(s);
	  }
	  System.out.println("*****************");
	  System.out.println("Eleman cikariliyor:" + queue.poll());
	  
	  System.out.println("*****************");
	  for(String s: queue) {
		  System.out.println(s);
	  }
	  System.out.println("*****************");
	  System.out.println(queue.isEmpty());
	  
	  while(!queue.isEmpty()) {
		  System.out.println("Eleman cikariliyor:" + queue.poll());
	  }
	}
		
}
