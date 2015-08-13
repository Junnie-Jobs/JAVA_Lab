package studentinfo;

import java.util.ArrayList;

public class CourseSession {
	private String sessionName;
	private int sessionId;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public CourseSession(String sessionName, int sessionId){
		this.sessionName = sessionName;
		this.sessionId = sessionId;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public int getSessionId() {
		return sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	
	public void enroll(Student student){
		studentList.add(student);
	}
}
