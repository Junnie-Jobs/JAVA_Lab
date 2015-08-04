package manage;

import java.util.ArrayList;

import student.Student;

public class StudentDatabase {

	public static StudentDatabase instance = new StudentDatabase();
	public static StudentDatabase getInstance(){
		if(instance == null){
			instance = new StudentDatabase();
		}
		return instance;
	}
	private StudentDatabase(){}
	
	
	public ArrayList<Student> totalStudentList = new ArrayList<Student>();
	
	public Student getStudentInlist(int index) {
		return this.totalStudentList.get(index);
	}
	
	public int getTotalStudentListLength(){
		return totalStudentList.size();
	}
}
