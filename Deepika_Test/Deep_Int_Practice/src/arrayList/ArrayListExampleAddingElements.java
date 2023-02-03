//Sort ArrayList By using Collections.sort() method

package arrayList;
import java.util.*;

public class ArrayListExampleAddingElements {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("QWERTY");
		list.add("ASDFGH");
		list.add("ABCDEFGH");
		System.out.println("List: " +list);
		Collections.sort(list);
		for(String alpha:list)
		{
			System.out.println("List: " +alpha);	
		}	
	}

}
