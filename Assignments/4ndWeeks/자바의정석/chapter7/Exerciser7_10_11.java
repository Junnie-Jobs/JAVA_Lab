package chapter7;

class MyTV{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			System.out.println("조정가능한 수치가 아닙니다.");
		else
		this.channel = channel;
		
		
	}
	public int getChannel() {
		
		return channel;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)
			System.out.println("조정가능한 수치가 아닙니다.");
		else
		this.volume = volume;
		
	}
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}
	
}



public class Exerciser7_10_11 {
	
	public static void main(String[] args) {
		
		MyTV tv = new MyTV();
		
		tv.setChannel(10);
		System.out.println("CH: "+tv.getChannel());
		tv.setVolume(20);
		System.out.println("VOL:"+tv.getVolume());
	}

}
