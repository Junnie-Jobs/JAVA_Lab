package chapter7;

abstract class Unit{
	
	int x, y;
	abstract void move(int x, int y);
	void step(){}
}

class Marine extends Unit{
	void move(int x, int y){};
	void stimPack(){}
}

class Tank extends Unit{
	void move(int x, int y){}
	void chaneMode(){}
}

class Dropship extends Unit{
	
	void move(int x, int y){}
	void load(){}
	void unload(){}
	
}




public class Exercise7_17 {

}
