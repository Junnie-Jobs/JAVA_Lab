package automobile_com;

public class CalculatePrice {

	public static void printResult(){
		if(calculatePrice() < 10000)
			System.out.println("보유 자동차 총 액은 "+calculatePrice()+"만원 입니다.");
		if(calculatePrice() > 10000){
			int hundredMil = Math.round(calculatePrice()/10000); 
			int tenMil = calculatePrice()-hundredMil*10000;
			System.out.println("보유 자동차 총 액은 "+hundredMil+"억 "+tenMil+"만원 입니다.");
		}
	}
	
	private static int calculatePrice(){
		int totalPrice = 0;
		SingleCompany company = SingleCompany.getInstance();
		
		for(int i=0; i< company.carList.length; i++){
			totalPrice += company.carList[i].numOfCar * company.carList[i].getPrice();
		}
		return totalPrice;
	}
}
