//Iterating ArrayList using For-each loop


package arrayList;
import java.util.*;
//by using iterator
public class ArrayListExample3Forloop {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ABCDEF");
		list.add("GHIJKLM");
		list.add("UVWXYZ");
		for(String alpha:list) {
			System.out.println(alpha);
		}
	}

}
