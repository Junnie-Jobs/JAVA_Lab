package treeset;

import java.util.TreeSet;

public class AccountTreeSetTest {

	public static void main(String[] args) {
		
		AccountManagerTreeSet manager = new AccountManagerTreeSet();
		
		manager.insertAccount("1231", "Tomas", 3000.0f);
		manager.insertAccount("1232", "Edward", 4000.0f);
		manager.insertAccount("1233", "James", 5000.0f);
		manager.insertAccount("1234", "Percy", 6000.0f);
		manager.insertAccount("1235", "Ellizabeth", 7000.0f);
		
		manager.setDeposite("1231", 500);
		manager.setDeposite("1232", 500);
		manager.setDeposite("1233", 500);
		manager.setDeposite("1234", 500);
		manager.setDeposite("1235", 500);
		
		manager.displayAll();

//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(100);
//		set.add(50);
//		set.add(500);
//		set.add(200);
//		set.add(10000);
//		
//		System.out.println(set);
		
	}

}
