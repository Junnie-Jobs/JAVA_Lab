package thread;

class Outer{
	
	private int outerI = 100;
	Inner inner;
	
	class Inner{
		String str = "hello";
		public void test(){
			System.out.println(str);
			System.out.println(outerI);
		}
	}
	
	public Outer(){
//		inner = new Inner();
		inner = this.new Inner();
	}
	
	public void outTest(){
		inner.test();
	}
	
	public Runnable getRunnable(){
		int i = 0;
		
//		이것은 익명 클래
		return new Runnable(){

			@Override
			public void run() {
				System.out.println(i);
				System.out.println("runnable");
			}
		};
		
//		이것은 local inner class
		
//		class Command implements Runnable{
//
//			@Override
//			public void run() {
//				System.out.println(i);
//				System.out.println("runnable");
//			}
//			
//		}
//		
//		return new Command();
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.outTest();
		
		Runnable in = outer.getRunnable();
		in.run();
	}

}
