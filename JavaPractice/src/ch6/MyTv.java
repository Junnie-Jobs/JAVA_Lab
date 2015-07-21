package ch6;

public class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	MyTv(boolean isPowerOn, int channel, int volume){
		this.isPowerOn = isPowerOn;
		this.channel = channel;
		this.volume = volume;
	}
	
	public final int MAX_VOLUME = 100;
	public final int MIN_VOLUME = 0;
	public final int MAX_CHANNEL = 100;
	public final int MIN_CHANNEL = 1;
	
	public void turnOnOff(){
		isPowerOn = !isPowerOn;
	}
	public void volumeUp(){
		if(this.invalidCheck(volume, MAX_VOLUME))
			return;
		volume++;
	}
	public void volumeDown(){
		if(this.invalidCheck(volume, MIN_VOLUME))
			return;
		volume--;
	}
	public void channelUp(){
		if(this.invalidCheck(channel, MAX_CHANNEL))
			return;
		channel++;
	}
	public void channelDown(){
		if(this.invalidCheck(channel, MIN_CHANNEL))
			return;
		channel--;
	}
	
	
	
	
	private boolean invalidCheck(int value, int limit){
		if(value == limit){
			System.out.println("is LIMITED");
			return true;
		}
		return false;
	}
}
