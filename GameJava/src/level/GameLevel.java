package level;

import java.util.ArrayList;

public abstract class GameLevel {

	static ArrayList<GameLevel> lvList = new ArrayList<GameLevel>();
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public final void play(){
		simpleAttack();
		turnAttack();
		flyingAttack();
	}
}
