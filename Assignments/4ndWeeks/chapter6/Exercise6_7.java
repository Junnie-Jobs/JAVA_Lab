package chapter6;

public class Exercise6_7 {
	
	int x;
	int y;
	
	Exercise6_7(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1){
		
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		
	}
	


	
	
	public static void main(String[] args) {
		
		Exercise6_7 p = new Exercise6_7(1,1);
		
		System.out.println(p.getDistance(2,2));
		
	}
}
