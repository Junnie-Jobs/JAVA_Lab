package object;

class Dog {
	String name;
	String type;
	
	public Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString(){
		return name + ", " + type;
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("멍멍이", "잡종");
		System.out.println(myDog);
		
		String str = new String("aaa");
		System.out.println(str.toString());
		
		Integer i = new Integer(100);
		System.out.println(i);
	}

}
