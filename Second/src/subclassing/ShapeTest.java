package subclassing;

class Shape{
	public void draw(){
		System.out.println("Draw shape");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Draw Circle");
	}
	
	public void circle(){
		System.out.println("circle()");
	}
}

class Rectangle extends Shape{
	public void draw(){
		System.out.println("Draw Rectangle");
	}
	public void rectangle(){
		System.out.println("tectangle()");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("Draw Triangle");
	}
	public void triangle(){
		System.out.println("triangle()");
	}
}

public class ShapeTest {

	public static void main(String[] args) {

//		ShapeTest st = new ShapeTest();
//
//		st.drawShape(new Triangle());
//		st.drawShape(new Rectangle());
//		st.drawShape(new Circle());
		
		Shape sList[] = {new Circle(), new Rectangle(), new Triangle()};
		
		for(int i=0; i < sList.length; i++) {
			Shape s = sList[i];
			s.draw();
			
//			s가 어떤 하위class의 instance인지 확인 후 method실행
			if( s instanceof Circle ) {
				Circle c = (Circle)s;
				c.circle();
			}
			else if( s instanceof Rectangle ){
				Rectangle r = (Rectangle)s;
				r.rectangle();
			}
			else if( s instanceof Triangle ){
				Triangle t = (Triangle)s;
				t.triangle();
			}
			else{
				System.out.println("ShapeERROR");
			}
			
		}		

		
		
		
		
	}
	
	public void drawShape(Shape s){
		s.draw();
	}
	
	public Shape makeShape(int type){
		if(type == 1) return new Circle();
		else if(type ==2 ) return new Rectangle();
		else return null;
	}

}
