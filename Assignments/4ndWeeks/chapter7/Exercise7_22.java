package chapter7;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition(){
		return p;
	}
	
	void setPosition(Point p){
		
		thir.p = p;
	}
	
Class Rect extends Shape{
	
	double width;
	double height;
	
	Rect(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rect(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSqare(){
		return width*height != 0 && width == height;
	}
	
	double calcArea(){
		return width * height;
	}
}

class Circle extends Shape{
	
	double r;
	
	Circle(double r){
		this(new Point(0,0), r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r=r;
	}
	
	double calcArea(){
		return Math.PI*r*r;
	}
}
	
class Point{
	
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return "["+x+","+y+"]";
	}
}
	
}


public class Exercise7_22 {

	
	static double sumArea(Shape[] arr){
		double sum=0;
		
		for(int i=0; i<arr.length; i++)
			sum+=arr[i].calcArea();
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
		
	}
	
}
