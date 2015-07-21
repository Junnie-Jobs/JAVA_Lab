package level;

public class Player {
	
	private GameLevel currentLevel;
	private int gameLevel;
	
	Player(){
		this.gameLevel = 0;
		this.currentLevel = GameLevel.lvList.get(gameLevel);
	}
	
	public void attack(){
		this.getGameLevel().play();
	}

	public void upgradeLevel(){
		gameLevel++;
		currentLevel = GameLevel.lvList.get(gameLevel);
	}
	
	private GameLevel getGameLevel(){
		return currentLevel;
	}
}
