package level;

public class GameLevel1 extends GameLevel{

	private static GameLevel1 gameLv1 = new GameLevel1();
	private GameLevel1(){};
	
	public static GameLevel1 getLevel(){
		if(gameLv1 == null){
			gameLv1 = new GameLevel1();
		}
		return gameLv1;
	}
	
	
	@Override
	public void simpleAttack() {
		System.out.println("SimpleAttack");
	}

	@Override
	public void turnAttack() {
		System.out.println("ㄴㄴㄴㄴ");
	}

	@Override
	public void flyingAttack() {
		System.out.println("ㄴㄴㄴㄴ");
	}


}
