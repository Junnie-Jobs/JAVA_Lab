package tv;

public class TVTest {

	public static void main(String[] args) {
		
		TV tv1 = new LGTV();
		TV tv2 = new SamsungTV();
		
		tv1.channelDown();
		tv2.channelUp();

	}

}
