package second;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("Lee", 80.0f, 180.0f);
		
		System.out.println(personLee);
		personLee.printThis();
		
		System.out.println(personLee.getThis());

	}
}
