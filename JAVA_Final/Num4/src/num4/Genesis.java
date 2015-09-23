package num4;

public class Genesis extends Car{

	@Override
	public void start() {
		System.out.println("Genesis Start!");
	}
	@Override
	public void drive() {
		System.out.println("Genesis Drive!");
	}
	@Override
	public void stop() {
		System.out.println("Genesis Stop!");
	}
	@Override
	public void turnoff() {
		System.out.println("Genesis TurnOff!");
	}
}
