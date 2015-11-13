package chapter6;

public class Exercise6_3_4_5 {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Exercise6_3_4_5(){}
	Exercise6_3_4_5(String name, int ban, int no, int kor, int eng, int math){
		
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	int getTotal(){
		
		return this.kor+this.eng+this.math;
	}
	
	float getAverage(){
		
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	
	public String info(){
		
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
	public static void main(String[] args) {
	
		Exercise6_3_4_5 s= new Exercise6_3_4_5();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
		Exercise6_3_4_5 s2 = new Exercise6_3_4_5("홍길동2", 1,1,100,60,76);
		System.out.println(s2.info());
		
	}
	

}


