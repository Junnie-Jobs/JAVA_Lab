package second;

public class StudentTest {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.getStudentNumber();
		
		Student stu2 = new Student();
		stu2.getStudentNumber();
		
		stu1.getStudentNumber();
		
		System.out.println(Student.getNumberOfStudents()+"명");
	}
}
