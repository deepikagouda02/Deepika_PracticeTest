package arrayListlinkedList;

import java.util.*;

public class ArrayListLinkedList {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		list1.add("ABCD");
		list1.add("WXYZ");
		System.out.println("list is: " +list1);
		
		List<String> list2=new LinkedList<String>();
		list2.add("QWERTY");
		list2.add("ASDFGH");
		
		System.out.println("List is: " +list2);

	}
}
