//Java LinkedList Example for adding an elements


//Java LinkedList example to add elements

package linkedList;

import java.util.*;

public class LinkedListExampleAddingElements {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();	
		list.add("XYZQ");
		list.add("WXYZAB");
		list.add("PQRSTABCD");
		list.add("ABCD");
		System.out.println("List before adding: " +list);
		list.add(1, "ZQTPWEW");
		System.out.println("List after adding: " +list);
		list.remove(2);
		System.out.println("List after removing: " +list);
		list.removeFirst();
		System.out.println("List after removing: " +list);
		list.removeLast();
		System.out.println("List after removing: " +list);
		list.clear();
		System.out.println("List after removing: " +list);
		list.addFirst("AAAAAQW");
		System.out.println("List after Adding first ele: " +list);
		list.addLast("ZZZZZZZZABC");
		System.out.println("List aftemhui0r Adding Last ele: " +list);
		
		
		
		
		

	}
}
