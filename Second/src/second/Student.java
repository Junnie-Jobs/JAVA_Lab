package second;

public class Student {
	
	public String name;
	public String major;
	public String address;
	
	private static int numberOfStudents = 1;
	private static int serialNumber = 1001;
	//serialNumber는 static 변수
	private int studentNumber;
	//studentNumber는 instance 변수
	
	public Student(String name, String major, String address){
		this.name = name;
		this.major = major;
		this.address = address;
		
		this.initStudentNumber();
	}
	
	public Student() {
		this("이름없음", "학과없음", "주소없음");
	}
	
	public void printStudent() {
		System.out.println(this.studentNumber);
		System.out.println(this.name);
		System.out.println(this.major);
		System.out.println(this.address);
	}
	
	public void initStudentNumber() {
		this.studentNumber = this.serialNumber ++;
		this.numberOfStudents ++;
	}
	
	public void getStudentNumber() {
		System.out.println(studentNumber);
	}
	
	public static int getNumberOfStudents() {
		return numberOfStudents;
	}
	
}
