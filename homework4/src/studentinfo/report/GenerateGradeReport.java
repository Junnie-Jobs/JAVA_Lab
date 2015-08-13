package studentinfo.report;

import java.util.ArrayList;



import studentinfo.GradeStrategy;
import studentinfo.MajorGradeStrategy;
import studentinfo.RegularGradeStrategy;
import studentinfo.School;
import studentinfo.Score;
import studentinfo.Student;
import studentinfo.utils.Define;

public class GenerateGradeReport {

	School school = School.getInstance();
	public static final String TITLE = "\t  GOOD SCHOOL \t\t\n";
	public static final String HEADER = " 이름  |  학번   |  학과  |  수학   | 영어  |\n";
	public static final String LINE = "---------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport(){
		makeHeader();
		makeBody();
		makeFooter();
		
		return buffer.toString();
	}
	
	public void makeHeader(){
		buffer.append(GenerateGradeReport.LINE);
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	} 
	
	public void makeBody(){
		
		ArrayList<Student> studentList = school.getStudentList();
		
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSession().getSessionName());
			buffer.append(" | ");
			
			getScoreGrade(student);
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student){
		
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSession().getSessionId();
		
		GradeStrategy[] gradeStategies = {new RegularGradeStrategy(), new MajorGradeStrategy()};
		for(int i=0; i<scoreList.size(); i++){
			
			Score score = scoreList.get(i);
			String grade;
			if(score.getSession().getSessionId() == majorId)
				grade = gradeStategies[Define.MAJOR].getGrade(score.getPoint());
			else
				grade = gradeStategies[Define.NOT_MAJOR].getGrade(score.getPoint());
			buffer.append(score.getPoint());
			buffer.append(":");
			buffer.append(grade);
			buffer.append(" | ");
		}
	}
	
	public void makeFooter(){
		buffer.append("\n");
	}
}