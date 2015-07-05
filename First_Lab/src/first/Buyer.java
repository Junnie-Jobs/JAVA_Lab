package first;

public class Buyer {
	private int money;
	private int numOfFruit;
	
	//constructor 생성 
	public Buyer(){}
	public Buyer(int money) {
		this.money = money;
		this.numOfFruit = 0;
	}
	
	//method() 생성 
	public void buyFruit(Seller seller, int money) {
		int count = seller.sellFruit(money);
		this.numOfFruit += count;
		this.money -= money;
	}
	public void printBuyer() {
		System.out.println("소지금 : "+money);
		System.out.println("과일수 : "+numOfFruit);
	}
}