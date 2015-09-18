package exception;

import logging.MyLogger;

public class Student {

	private String studentName;
	MyLogger myLogger = new MyLogger();
	
	public Student(String studentName) throws StudentNameFormatException{
		if(studentName == null){
			throw new StudentNameFormatException("name must not be null");
		}
		if(studentName.split(" ").length > 3){
			throw new StudentNameFormatException("too long");
		}
		this.studentName = studentName;
	}
	
	public String getStudentName(){
		myLogger.fine("begin getStudentName()");
		return this.studentName;
	}
}
