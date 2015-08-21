package studentinfo;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
	
	private int studentId;
	private String studentName;
	private CourseSession majorSession;
	
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student( int studentId, String studentName, CourseSession majorSession){
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSession = majorSession;
	}
	
	public void addCourseScore(Score score){
		scoreList.add(score);
	}
	
	public ArrayList<Score> getScoreList(){
		return scoreList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public CourseSession getMajorSession() {
		return majorSession;
	}

	public void setMajorSession(CourseSession majorSession) {
		this.majorSession = majorSession;
	}

	@Override
	public int compareTo(Student student) {
		return this.studentName.compareTo(student.studentName);
	}
}
