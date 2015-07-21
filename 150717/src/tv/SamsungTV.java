package tv;

public class SamsungTV extends TV{

	@Override
	public void channelUp() {
		System.out.println("samsung channelUp");
	}

	@Override
	public void channelDown() {
		System.out.println("samsung channelDown");	
	}
}
