package automobile_com;

public class CalculatePrice {

//	결과값을 보여주는 method()
//	금액에 따른 출력값 조정
	public static void printResult(){
		if(calculatePrice() < 10000){
			System.out.println("보유 자동차 총 액은 "+calculatePrice()+"만원 입니다.");
			return;
		}
		if(calculatePrice() > 10000){
			int hundredMil = Math.round(calculatePrice()/10000); 
			int tenMil = calculatePrice()-hundredMil*10000;
			System.out.println("보유 자동차 총 액은 "+hundredMil+"억 "+tenMil+"만원 입니다.");
			return;
		}
	}
	
//	보유 차량 총액을 계산해 주는 method()
//	회사는 하나니까~ 특정 company의 총액을 계산하는게 아닌 특정 회사의 총액을 계산하는 method()
	private static int calculatePrice(){
		int totalPrice = 0;
		SingleCompany company = SingleCompany.getInstance();
		
		for(int i=0; i< company.carList.length; i++){
			totalPrice += company.carList[i].numOfCar * company.carList[i].getPrice();
		}
		return totalPrice;
	}
}
