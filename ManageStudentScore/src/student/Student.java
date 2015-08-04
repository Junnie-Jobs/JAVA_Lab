package student;

import manage.StudentDatabase;

public class Student {

	StudentDatabase sDB = StudentDatabase.getInstance();
	
	private String name;
	private String studentNumber;
	private String major;
	private int mathScore;
	private int engScore;
	
	public Student(String name, String studentNumber, String major){
		this.name = name;
		this.studentNumber = studentNumber;
		this.major = major;
		this.mathScore = -1;
		this.engScore = -1;
		
		sDB.totalStudentList.add(this);
	}
	
	public String getMajor(){
		return this.major;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
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
