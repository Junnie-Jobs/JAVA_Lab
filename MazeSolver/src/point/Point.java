package point;

import util.Define;

public class Point {
	
	private int point_x;
	private int point_y;
	private String value;
	private int aStarValue;
	
	public Point(){}
	
	public Point(int x, int y, String value){
		this.point_x = x;
		this.point_y = y;
		this.value = value;
	}

	
	
	
	public int getPoint_x() {
		return point_x;
	}
	public int getPoint_y() {
		return point_y;
	}
	
	public void setPoint_x(int point_x) {
		if(point_x < Define.MININDEX || point_x > Define.MAXINDEX){
			System.out.println("Invalid point value");
			return;
		}
		this.point_x = point_x;
	}
	public void setPoint_y(int point_y) {
		if(point_y < Define.MININDEX || point_y > Define.MAXINDEX){
			System.out.println("Invalid point value");
			return;
		}
		this.point_y = point_y;
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public int getAStarValue() {
		return aStarValue;
	}
	public void setAStarValue(int aStarValue) {
		this.aStarValue = aStarValue;
	}
	
	
}
