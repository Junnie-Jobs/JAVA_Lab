package second;

import java.util.Calendar;

public class SingletonTest {

	public static void main(String[] args) {
	
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);
		//결국 같은 것이다.
	}

}
