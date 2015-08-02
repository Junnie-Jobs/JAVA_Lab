package subject.type;

import java.util.ArrayList;

import student.Student;
import subject.ISubject;

public class Math implements ISubject{

	public static Math instance = new Math();
	public static Math getInstance(){
		if(instance == null){
			instance = new Math();
		}
		return instance;
	}
	private Math(){}
	
	private ArrayList<Student> sList = new ArrayList<Student>();
	
	@Override
	public void enroll(Student student) {
		sList.add(student);	
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
