package hashset;

import java.util.HashSet;

public class AccountHashSetTest {

	public static void main(String[] args) {
		
		AccountManagerHashSet manager = new AccountManagerHashSet();
		
		manager.insertAccount("1231", "Tomas", 3000.0f);
		manager.insertAccount("1232", "Edward", 4000.0f);
		manager.insertAccount("1233", "James", 5000.0f);
		manager.insertAccount("1234", "Percy", 6000.0f);
		manager.insertAccount("1231", "Tomas2", 7000.0f);
		
		manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);
		
		manager.displayAll();
		
//		HashSet<String> set = new HashSet<String>();
//		set.add("춘향이");
//		set.add("신데렐라");
//		set.add("심청이");
//		set.add("춘향이");
//		
//		System.out.println(set);
		
	}

}
