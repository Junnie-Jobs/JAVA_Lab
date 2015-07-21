package level;

public class Board {

	public static void main(String[] args) {
	
		GameLevel.lvList.add(GameLevel1.getLevel());
		GameLevel.lvList.add(GameLevel2.getLevel());
		GameLevel.lvList.add(GameLevel3.getLevel());
		
//		ArrayList를 통해 구현하려 했으나, 위의 코드를 넣을 적절한 위치를 찾지 못했습니다.
//		일단 ArrayList는 GameLevel이 갖고 있는게 가장 적합할 듯 하여 그리 두었으
//		위의 코드는 GameLevel도, singleton도, player도 부적합한 듯 하여, 단 한번 순서대로 실행해 줄 board.java에 넣었습니다.
		
		Player player1 = new Player();
		
		player1.attack();
		player1.upgradeLevel();
		player1.attack();
		player1.upgradeLevel();
		player1.attack();

	}

}
