//Java LinkedList Example


package linkedList;

import java.util.*;

public class LinkedListExampleDecs {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("ABCDE");
		list.add("AZSWERTY");
		list.add("AECDSWRGF");
		list.add("MNSDFSVXVXG");
		System.out.println("List is: " +list);
		
		Iterator itr=list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
			
		}
	}
}
