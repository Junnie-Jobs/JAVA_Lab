//7-1, 7-2, 7-14

package ch7;

public class SutdaDeck {

	final int CARD_NUM = 20;
//	CARD_NUM은 왜 선언한건지 모르겠다
	public SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	public void SutdaDeck(){
		for(int i=0; i<cards.length; i++){
			int value = (i+1)%10;
			boolean isKwang = (value<=10)&&(value==1||value==3||value==8);
			
			cards[i] = new SutdaCard(value, isKwang);
		}
	}
	
	public void Shuffle(){
		for(int i=0; i<cards.length; i++){
			int x = (int)(Math.random()*cards.length);
			int y = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[y];
			cards[x] = cards[y];
			cards[y] = tmp;
		}
	}
	
	public SutdaCard pick(int index){
		return (index < 0 || index > cards.length) ? null : cards[index];
	}
	
	public SutdaCard pick(){
		int index = (int)(Math.random()*cards.length);
		return cards[index];
	}
	
}

//7-14반영. 변경되지 않도록 final을 붙여준다
class SutdaCard{
	public final int NUM;
	public final boolean IS_KWANG;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	public String toString(){
		return NUM + ( IS_KWANG ? "K":"");
	}
}