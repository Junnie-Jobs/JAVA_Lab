package first;

public class Seller {
	int price;
	int numOfFruit;
	int money;

	
	public Seller(int price, int numOfFruit, int money) {
		this.price = price;
		this.money = money;
		this.numOfFruit = numOfFruit;
	}
	
	public int sellFruit(int money) {
		int count = money/price;
		this.money += money;
		this.numOfFruit -= count;
		return count;
	}
	
	
	public void printSeller() {
		System.out.println("수익금 : "+money);
		System.out.println("과일수 : "+numOfFruit);
	}
}
