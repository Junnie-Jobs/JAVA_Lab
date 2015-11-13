package strategy;

public interface IGrade {
	
	int MAXIMUM = 100;
	int MINIMUM = 0;

	String calcGrade(int score);
	
}