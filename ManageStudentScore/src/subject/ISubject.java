package subject;

import student.Student;

public interface ISubject {

	public abstract void enroll(Student student);
	public abstract Student getStudentInSlist(int index);
	public abstract int getListLength();
}
