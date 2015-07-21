package level;

public class GameLevel3 extends GameLevel{

	private static GameLevel3 gameLv3 = new GameLevel3();
	private GameLevel3(){};
	
	public static GameLevel3 getLevel(){
		if(gameLv3 == null){
			gameLv3 = new GameLevel3();
		}
		return gameLv3;
	}
	
	
	@Override
	public void simpleAttack() {
		System.out.println("SimpleAttack x 3");
	}

	@Override
	public void turnAttack() {
		System.out.println("TurnAttack!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("FlyingAttack!");
	}

}
