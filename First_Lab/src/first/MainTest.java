package first;

public class MainTest {

	public static void main(String[] args) {
		
		Man leeMan = new Man(); 
//		new를 통해 생성하는 것
//		생성자라고 함. 매개변수가 없으니 default constructor
		
		leeMan.setHeight(180);
		leeMan.setName("이승기");
		
//		leeMan.name을 사용하지 않는 이유 :
//			잘못된 값이 name으로 바로 들어가는 것을 막기 위해 method를 사용하는 것
//			class 내에서 private String name으로 선언하여 외부에서의 접근을 차단
		
		Man kimMan = new Man();
		kimMan.setName("김수현");
		
		System.out.println(leeMan.getName());
		System.out.println(kimMan.getName());
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 10;
		p1.y = 20;
		
		p2 = p1;
		
		System.out.println(p1.x);
		System.out.println(p2.x);
		
		Man2 human = new Man2();
		
		human.setName("James");
		human.setAge(40);
		human.marriage = true;
		human.children = 3;
		
	}

}
