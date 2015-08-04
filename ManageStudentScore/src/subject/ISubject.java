package subject;

import student.Student;

public interface ISubject {

	int MAX_SCORE = 100;
	int MIN_SCORE = 0;
	
	public abstract void enroll(Student student);
	public abstract void setStudentScore(Student student, int score);
	public abstract Student getStudentInSlist(int index);
	public abstract int getListLength();
}
