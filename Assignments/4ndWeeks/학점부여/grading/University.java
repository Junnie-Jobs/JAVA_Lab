package grading;

public class University {

	private static University university = new University();
	
	private University(){}
	
	public static University getUniversity(){
		return university;
	}

	public void printReport(Session session) {
		GradeReport report = new GradeReport();
		report.printGradeReport(session);
	}
	
}