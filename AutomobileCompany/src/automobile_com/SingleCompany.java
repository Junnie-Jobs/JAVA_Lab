package automobile_com;

import java.util.ArrayList;

public class SingleCompany {
	
//	싱글톤!
	private static SingleCompany company = new SingleCompany();
	
	private SingleCompany() {}
	
	public static SingleCompany getInstance() {
		if(company == null)
			company = new SingleCompany();
		return company;
	}
	
//	다르게 구현해보자
	private ArrayList<Automobile> carList1= new ArrayList<Automobile>();
	
	public void addCar1(Automobile car, int num){
		for(int i=0; i<num; i++)
			carList1.add(car);
	}
	
	public void deleteCar1(Automobile car, int num){
		int numOfCar = 0;
		ArrayList indexList = new ArrayList();
		
		for(int i=0; i<carList1.size(); i++){
			if(carList1.get(i) == car){
				numOfCar++;
				indexList.add(i);
			}
		}
		
		if(num > numOfCar)
			System.out.println("삭제하려는 차량의 수가 보유량보다 많습니다");
		else{
			carList.get(i);
		}
	}
//	다르게 구현 중
	
//	보유 차량 리스트
//	새로운 종류의 차량을 소유하게 되면, 리스트에 추가하는 method()를 만들자
	Automobile carList[] = {new Sonata(), new Grandeur(), new Genesis()};

//	차량 수 추가
	public void addCar(Automobile car, int num) {
		if (car instanceof Sonata){
			carList[0].setNumOfCar(carList[0].getNumOfCar() + num);
		}else if(car instanceof Grandeur){
			carList[1].setNumOfCar(carList[1].getNumOfCar() + num);
		}else if(car instanceof Genesis){
			carList[2].setNumOfCar(carList[2].getNumOfCar() + num);
		}else{
			System.out.println("ERROR::다시 입력해 주세요");
		}
	}

//	차량 수 감소
	public void deleteCar(Automobile car, int num) {

		if (car instanceof Sonata){
			carList[0].setNumOfCar(carList[0].getNumOfCar() - num);
		}else if(car instanceof Grandeur){
			carList[1].setNumOfCar(carList[1].getNumOfCar() - num);
		}else if(car instanceof Genesis){
			carList[2].setNumOfCar(carList[2].getNumOfCar() - num);
		}else{
			System.out.println("ERROR::다시 입력해 주세요");
		}
	}
	
//	보유 차량 리스트 보여주는 method()
	public void printCarList(){
		System.out.println("Sonata : "+carList[0].numOfCar);
		System.out.println("Grandeur : "+carList[1].numOfCar);
		System.out.println("Genesis : "+carList[2].numOfCar);
	}
}
