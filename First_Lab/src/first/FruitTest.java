package first;

public class FruitTest {

	public static void main(String[] args) {

		Buyer FruitBuyer = new Buyer(10000);
		
		Seller FruitSeller1 = new Seller(100,20,0);
		Seller FruitSeller2 = new Seller(500,20,0);
		
		FruitBuyer.buyFruit(FruitSeller1, 1000);
		System.out.println("소비자 정보 출력");
		FruitBuyer.printBuyer();
		
		FruitBuyer.buyFruit(FruitSeller2, 2000);
		System.out.println("소비자 정보 출력");
		FruitBuyer.printBuyer();
		
		System.out.println("거래 종료 후 판매자 실적");
		System.out.println("판매자1");
		FruitSeller1.printSeller();
		System.out.println("판매자2");
		FruitSeller2.printSeller();
	}
}
