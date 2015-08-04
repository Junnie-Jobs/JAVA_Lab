package subject.type;

import java.util.ArrayList;

import student.Student;
import subject.ISubject;

public class English implements ISubject{

	public static English instance = new English();
	public static English getInstance(){
		if(instance == null){
			instance = new English();
		}
		return instance;
	}
	private English(){}
	
	private ArrayList<Student> sList = new ArrayList<Student>();
	
	@Override
	public void enroll(Student student) {
		sList.add(student);	
	}
	
	@Override
	public void setStudentScore(Student student, int score){
		if(score > MAX_SCORE || score < MIN_SCORE)
			System.out.println("올바른 점수가 아닙니다.");
		student.setEngScore(score);
	}
	
	@Override
	public Student getStudentInSlist(int index) {
		return sList.get(index);
	}
	
	@Override
	public int getListLength() {
		return sList.size();
	}
	
}
