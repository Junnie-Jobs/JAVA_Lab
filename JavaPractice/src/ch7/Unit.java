package ch7;

public abstract class Unit {

	public int x;
	public int y;
	
//	이동하는 방법이 다들 다르므로 추상클래스로 정의 후 자식 클래스에서 세부 사항 결정
	protected abstract void move(int x, int y);
	public void stop(){};
}

class Marine extends Unit{
	public void move(int x, int y){};
	public void stinPack(){};
}

class Tank extends Unit{
	public void move(int x, int y){};
	public void changeMode(){};
}

class Dropship extends Unit{
	public void move(int x, int y){};
	public void load(){};
	public void unLoad(){};
}