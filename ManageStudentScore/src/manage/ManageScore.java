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
	
//	실제로 외부에 보여줄 method
	public void printMathResult(){
		Math math = Math.getInstance();
		
		System.out.println("====================수학 등급====================");
		System.out.println("학생 이름 \t학번 \t수학 등급");
		
		for(int i=0; i<math.getListLength(); i++){
			String studentName = math.getStudentInSlist(i).getStudentName();
			String studentNum = math.getStudentInSlist(i).getStudentNumber();
			String mathScoreByMajor = mathScoreByMajor(math, i);
			
			System.out.println(studentName +"\t"+ studentNum +"\t"+ mathScoreByMajor);
		}
	}
	
	public void printEnglishResult(){
		English english = English.getInstance();
		
		System.out.println("====================영어 등급====================");
		System.out.println("학생 이름 \t학번 \t영어 등급");
		
		for(int i=0; i<english.getListLength(); i++){
			String studentName = english.getStudentInSlist(i).getStudentName();
			String studentNum = english.getStudentInSlist(i).getStudentNumber();
			String engScoreByMajor = engScoreByMajor(english, i);
			
			System.out.println(studentName +"\t"+ studentNum +"\t"+ engScoreByMajor);
		}
	}
	
	private String mathScoreByMajor (Math math, int index){
		String major = math.getStudentInSlist(index).getMajor();
		int mathScore = math.getStudentInSlist(index).getMathScore();
				
		if(major == "수학") return majorScore(mathScore);
		else return notMajorScore(mathScore);
	}
	private String engScoreByMajor (English english, int index){
		String major = english.getStudentInSlist(index).getMajor();
		int engScore = english.getStudentInSlist(index).getEngScore();
		
		if(major == "영어") return majorScore(engScore);
		else return notMajorScore(engScore);
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
		if(score < 60)
			return "F";
		return null;
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
		if(score < 55)
			return "F";
		return null;
	}
}
