package tv;

public class LGTV extends TV{

	@Override
	public void channelUp() {
		System.out.println("LG channelUp");
	}

	@Override
	public void channelDown() {
		System.out.println("LG channelDown");	
	}
}
