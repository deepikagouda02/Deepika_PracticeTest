//Java LinkedList Example


package linkedList;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();	
		list.add("XYZQ");
		list.add("WXYZAB");
		list.add("PQRSTABCD");
		list.add("ABCD");
		System.out.println("List: " +list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			Collections.sort(list);
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
