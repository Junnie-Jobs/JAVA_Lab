package test;

import manage.ManageScore;
import student.Student;
import subject.type.English;
import subject.type.Math;

public class ScoreTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("이승기", "141213", "수학");
		Student s2 = new Student("김수현", "141518", "영어");
		Student s3 = new Student("주원", "141230", "수학");
		Student s4 = new Student("김우빈", "141255", "수학");
		Student s5 = new Student("이민호", "141590", "영어");

		English eng = English.getInstance();
		eng.enroll(s1);
		eng.enroll(s2);
		eng.enroll(s3);
		eng.enroll(s4);
		eng.enroll(s5);
		
		eng.setStudentScore(s1, 20);
		eng.setStudentScore(s2, 100);
		eng.setStudentScore(s3, 60);
		eng.setStudentScore(s4, 89);
		eng.setStudentScore(s5, 95);
		
		Math math = Math.getInstance();
		math.enroll(s1);
		math.enroll(s2);
		math.enroll(s3);
		math.enroll(s4);
		math.enroll(s5);
		
		math.setStudentScore(s1, 95);
		math.setStudentScore(s2, 90);
		math.setStudentScore(s3, 76);
		math.setStudentScore(s4, 85);
		math.setStudentScore(s5, 90);
		
		ManageScore ms = ManageScore.getInstance();
		ms.printResult();
	}
}
