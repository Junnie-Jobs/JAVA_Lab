package studentinfo;

public class Score {
	int studentNumber;
	CourseSession session;
	int point;
	
	public Score( int studentNumber, CourseSession session, int point){
		this.studentNumber = studentNumber;
		this.session = session;
		this.point = point;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public CourseSession getSession() {
		return session;
	}

	public void setSession(CourseSession session) {
		this.session = session;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String toString(){
		return "ÇĞ¹ø:" + studentNumber + "," + session.getSessionName() + ":" + point;
	}
	
	
	
}
