package refactoring;


public abstract class Car {
	
	public abstract void Start();
	public abstract void Drive();
	public abstract void Break();
	public abstract void TurnOff();
	public abstract void WashCar();
	
	
	public void launcher(){
		
		Start();
		Drive();
		Break();
		TurnOff();
		WashCar();
		System.out.println("=================");
	}
	


}
