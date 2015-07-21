package ch6;

//	예제 1,2

public class SutdaCard {
	public int num;
	public boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String info(){
		if(isKwang)
			return num+"K";
		return num+"";
	}
}