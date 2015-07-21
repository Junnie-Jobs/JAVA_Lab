package ch6;

//	예제 6, 7

public class MyPoint {

	private int x;
	private int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1){
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
	}
}
