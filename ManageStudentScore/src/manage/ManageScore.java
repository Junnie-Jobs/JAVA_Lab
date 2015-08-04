package manage;

import subject.ISubject;
import subject.type.English;
import subject.type.Math;

public class ManageScore {

//	각 학생의 전공과 점수에 따른 학점 책정 정책 method를 보유하고 있다.
//	각 과목별로 등록된 학생들의 학점을 test file에 출력하는 method를 보유하고 있다. 
	
//	싱글톤 패턴
	public static ManageScore instance = new ManageScore();
	public static ManageScore getInstance(){
		if(instance == null){
			instance = new ManageScore();
		}
		return instance;
	}
	private ManageScore(){}
	
	Math math = Math.getInstance();
	English english = English.getInstance();
	StudentDatabase sDB = StudentDatabase.getInstance();
	
//	실제로 외부에 보여줄 method
	public void printResult(){
		
		System.out.println("====================과목 등급====================");
		System.out.println("학생이름 \t학번 \t전공 \t수학 등급 \t영어 등급");
		
		for(int i=0; i<sDB.getTotalStudentListLength(); i++){
			String studentName = sDB.getStudentInlist(i).getStudentName();
			String studentNum = sDB.getStudentInlist(i).getStudentNumber();
			String studentMajor = sDB.getStudentInlist(i).getMajor();
			
			int mathScore = sDB.getStudentInlist(i).getMathScore();
			int engScore = sDB.getStudentInlist(i).getEngScore();
			
			String mathGrade = "__";
			String engGrade = "__";
			
			if(studentMajor == "수학"){
				mathGrade = majorScore(mathScore);
				engGrade = notMajorScore(engScore);
			}
			if(studentMajor == "영어"){
				engGrade = majorScore(engScore);
				mathGrade = notMajorScore(mathScore);
			}
			
			System.out.println(studentName +"\t"+ studentNum +"\t"+ studentMajor +"\t"+ mathGrade +"\t"+ engGrade);
		}
	}

	
//	아래 두 개의 method를 수정하면 각 점수에 따른 학점 책정 정책을 변경할 수 있다.
	private String majorScore(int score){
		if(score >= 95 && score <=100)
			return "S";
		if(score >= 90 && score < 95)
			return "A";
		if(score >= 80 && score < 90)
			return "B";
		if(score >= 70 && score < 80)
			return "C";
		if(score >= 60 && score < 70)
			return "D";
		if(score >= 0 && score < 60)
			return "F";
		return "_";
	}
	private String notMajorScore(int score){
		if(score >= 90 && score <=100)
			return "A";
		if(score >= 80 && score < 90)
			return "B";
		if(score >= 70 && score < 80)
			return "C";
		if(score >= 55 && score < 70)
			return "D";
		if(score >= 0 && score < 55)
			return "F";
		return "_";
	}
}
