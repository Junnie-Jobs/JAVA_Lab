package hyundai;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void breakCar();
	
	public final void operation(){
		start();
		drive();
		breakCar();
	}
}
