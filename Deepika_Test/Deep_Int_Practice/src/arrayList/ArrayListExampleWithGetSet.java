//Get and Set ArrayList
//The get() method returns the element at the specified index, whereas the set() method changes the element.

package arrayList;
import java.util.*;
//by using iterator
public class ArrayListExampleWithGetSet {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ABCDEF");
		list.add("GHIJKLM");
		list.add("UVWXYZ");
		System.out.println("List: " +list.get(0));
		list.set(0, "1234567");
		for(String alpha:list) {
			System.out.println(alpha);
		}
		
	}

}
