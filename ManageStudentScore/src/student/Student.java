package student;

public class Student {

	private String name;
	private String studentNumber;
	private String major;
	private int mathScore;
	private int engScore;
	
	public Student(String name, String studentNumber, String major, int mathScore, int engScore){
		this.name = name;
		this.studentNumber = studentNumber;
		this.major = major;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	
	public String getMajor(){
		return this.major;
	}
	
	public int getMathScore(){
		return this.mathScore;
	}
	
	public int getEngScore(){
		return this.engScore;
	}
	
	public String getStudentName(){
		return this.name;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}
}
