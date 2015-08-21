package studentinfo;

import java.util.ArrayList;
import java.util.TreeSet;

public class School {

	private static School instance = new School();
	
	private static String SCHOOL_NAME = "SilverBell School";
//	private ArrayList<Student> studentList = new ArrayList<Student>();
	private TreeSet<Student> studentList = new TreeSet<Student>();
	private ArrayList<CourseSession> sessionList = new ArrayList<CourseSession>();
	
	private School(){}
	
	public static School getInstance(){
		if(instance == null) 
			instance = new School();
		return instance;
	}
	
	public TreeSet<Student> getStudentList(){
		return studentList;
	}
	
	public ArrayList<CourseSession> getSessionList(){
		return sessionList;
	}
	
	public void addCourseSession(CourseSession session){
		sessionList.add(session);
	}
	
	public void addStudent(Student student){
		studentList.add(student);
	}
}
