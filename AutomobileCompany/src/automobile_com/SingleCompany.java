package automobile_com;

public class SingleCompany {
	
//	싱글톤!
	private static SingleCompany company = new SingleCompany();
	
	private SingleCompany() {}
	
	public static SingleCompany getInstance() {
		if(company == null)
			company = new SingleCompany();
		return company;
	}
	
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
