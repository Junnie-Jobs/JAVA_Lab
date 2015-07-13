package automobile_com;

public class Automobile {

	protected String name = "이름없음";
	protected int price = 0;
	protected int numOfCar = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumOfCar(int numOfCar) {
		this.numOfCar = numOfCar;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNumOfCar(){
		return numOfCar;
	}
}
