package tv;

public abstract class TV {

	public void turnOn(){
		System.out.println("turn on()");
	}
	
	public void turnOff(){
		System.out.println("turn off()");
	}
	
	public abstract void channelUp();
	public abstract void channelDown();
}
