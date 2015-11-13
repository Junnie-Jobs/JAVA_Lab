package chapter7;

class Buyer{
	
	int money = 1000;
	Product[] cart = new Product[3];
	int i=0;
	
	void buy(Product p){
		
		if(money < p.price)
			System.out.println("You don't have enough money");
			return;
		else
			money -= p.price;
			add(p);
	}
	
	void summary(){
		
		String itemList = "";
		int sum;
		
		for(int i=0; i<cart.length; i++)
		{
			if(cart[i] == null)
				break;
			itemList += cart[i] + ","
;
			sum += cart[i].price
		}
		
		System.out.println("products:" + itemList);
		System.out.println("used Money:" + sum);
		System.out.println("left Money:" + money);
	}
}

class Product{
	
	int price;
	
	Product (int price){
		this.price = price;
	}
}

class TV extends Product{
	TV() {
		super(100);
	}
	
	public String toString(){
		return "TV";
	}
	
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString(){
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}


public class Exercise7_19 {

	public static void main(String[] args) {
		
		
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
	}
}
