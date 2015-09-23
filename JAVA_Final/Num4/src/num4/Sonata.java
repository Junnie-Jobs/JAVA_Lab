package num4;

public class Sonata extends Car{

	public void start() {
		System.out.println("Sonata Start!");
	}
	@Override
	public void drive() {
		System.out.println("Sonata Drive!");
	}
	@Override
	public void stop() {
		System.out.println("Sonata Stop!");
	}
	@Override
	public void turnoff() {
		System.out.println("Sonata TurnOff!");
	}
}
