package level;

public class GameLevel2 extends GameLevel{

	private static GameLevel2 gameLv2 = new GameLevel2();
	private GameLevel2(){};
	
	public static GameLevel2 getLevel(){
		if(gameLv2 == null){
			gameLv2 = new GameLevel2();
		}
		return gameLv2;
	}
	
	
	@Override
	public void simpleAttack() {
		System.out.println("SimpleAttack x 2");
	}

	@Override
	public void turnAttack() {
		System.out.println("TurnAttack!");
	}

	@Override
	public void flyingAttack() {
		System.out.println("ㄴㄴㄴㄴ");
	}

}
