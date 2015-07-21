package ch6;

//	예제 3,4,5

public class Student{
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal(){
		return kor + eng + math;
	}
	
	public float getAverage(){
		return (float)(Math.round(getTotal()/3f*10)/10.0);
	}
	
	public String info(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}