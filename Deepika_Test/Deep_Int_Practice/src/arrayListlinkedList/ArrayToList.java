package arrayListlinkedList;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) {
		String[] array= {"abc","efg","ghti"};
		System.out.println("Printing an array: " +Arrays.toString(array));
		List<String> list=new ArrayList<String>();
		for(String alpha:array) {
			list.add(alpha);
		}
		System.out.println("List: " +list);
	}

}
