package chapter6;

public class Exercise6_1_2 {
	
	int num;
	boolean isKwang;
	
	
	Exercise6_1_2(){
		
		this(1,true);
	}
	

	Exercise6_1_2(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	String info(){
		
		if(isKwang == true)
			return num + "K";
		else
			return num + "";
		
	}
	
public static void main(String[] args) {
		
		
		Exercise6_1_2 card1 = new Exercise6_1_2(3, false);
		Exercise6_1_2 card2 = new Exercise6_1_2();
		
		System.out.println(card1.info()); //3출력
		System.out.println(card2.info()); //1K출력
	}


}
