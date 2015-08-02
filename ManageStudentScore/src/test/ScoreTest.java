package test;

import manage.ManageScore;
import student.Student;
import subject.type.English;
import subject.type.Math;

public class ScoreTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("이승기", "141213", "수학", 95, 20);
		Student s2 = new Student("김수현", "141518", "영어", 90, 100);
		Student s3 = new Student("주원", "141230", "수학", 76, 60);
		Student s4 = new Student("김우빈", "141255", "수학", 85, 89);
		Student s5 = new Student("이민호", "141590", "영어", 90, 95);

		English eng = English.getInstance();
		eng.enroll(s1);
		eng.enroll(s2);
		eng.enroll(s3);
		eng.enroll(s4);
		eng.enroll(s5);
		
		Math math = Math.getInstance();
		math.enroll(s1);
		math.enroll(s2);
		math.enroll(s3);
		math.enroll(s4);
		math.enroll(s5);
		
		ManageScore ms = ManageScore.getInstance();
		ms.printMathResult();
		ms.printEnglishResult();
		
	}

}
