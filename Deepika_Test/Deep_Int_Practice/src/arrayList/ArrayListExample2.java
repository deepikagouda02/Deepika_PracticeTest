//Iterating ArrayList using Iterator


package arrayList;
import java.util.*;
//by using iterator
public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ABCDEF");
		list.add("GHIJKLM");
		list.add("UVWXYZ");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
