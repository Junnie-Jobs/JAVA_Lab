package subclassing;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		
		String s = new String("PL_in_JAVA");
		list.add(s);
		
//		String str = (String)list.get(0);
		String str = list.get(0);
		System.out.println(str);
	}

}
