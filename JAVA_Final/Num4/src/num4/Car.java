package num4;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void run(){
		this.start();
		this.drive();
		this.stop();
		this.turnoff();
		System.out.println();
	}
	
	public void washCar(){
		System.out.println("WashCar!");
	}
}