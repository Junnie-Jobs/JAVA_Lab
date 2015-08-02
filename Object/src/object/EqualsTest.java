package object;

class Student {
	String studentId;
	String studentName;
	
	public Student(String studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student student = (Student) obj;
		
			if(this.studentId.equals(student.studentId))
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId.hashCode();
//		같은 ID값이면 같은 hashCode를 갖는다. 따라서 이 값을 리턴하게 되면 같은 Id의 경우 같은 값을 갖게 된다.
	}
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentKim1 = new Student("12345", "김기범");
		Student studentKim2 = new Student("12345", "김기범");

		System.out.println(studentKim1 == studentKim2);
		System.out.println(studentKim1.equals(studentKim2));
		
		System.out.println(studentKim1.hashCode());
		System.out.println(studentKim2.hashCode());
		
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
