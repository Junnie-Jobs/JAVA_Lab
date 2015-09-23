package num4;

public class Bumblebee extends Car {

	@Override
	public void start() {
		System.out.println("BumbleBumble Start!");
	}
	@Override
	public void drive() {
		System.out.println("BumbleBumble Drive!");
	}
	@Override
	public void stop() {
		System.out.println("BumbleBumble Stop!");
	}
	@Override
	public void turnoff() {
		System.out.println("BumbleBumble TurnOff!");
	}
}
