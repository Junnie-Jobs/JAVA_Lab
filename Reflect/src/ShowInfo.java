import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class A{
	public void m(){
		System.out.println("A.m()");
	}
}

class B extends A{
	public void m(){
		System.out.println("B.m()");
	}
}


public class ShowInfo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		try {
			Class c = Class.forName("B");
			
			Object obj = c.newInstance();
			System.out.println(obj);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
//		Class c = Integer.class;
//		System.out.println(c.getName());
//		
//		System.out.println("\n=== Integer Class¿« Constructor ===");
//		Constructor[] cons = c.getConstructors();
//		for( Constructor con : cons){
//			System.out.println(con);
//		}
//		
//		System.out.println("\n=== Integer Class¿« method ===");
//		Method[] methods = c.getMethods();
//		for( Method method : methods){
//			System.out.println(method);
//		}
	}
}
