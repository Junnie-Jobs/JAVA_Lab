package test;

import junit.framework.TestCase;
import lab.Student;

public class StudentTest extends TestCase{

	public void testStudent(){
		
		Student student = new Student("James");
		assertEquals("James", student.getName());
	}
}
