//7-10, 7-11

package ch7;

public class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0;
	private final int MAX_CHANNEL = 100;
	private final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume){
		if(volume >= MIN_VOLUME && volume <= MAX_VOLUME){
			this.volume = volume;
			System.out.println("볼륨 설정"+volume);
			return;
		}
		System.out.println("유효하지 않은 값입니다");
	}
	public void setChannel(int channel){
		if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL){
			
//			여기가 7-11에 추가된 라인. 이전 채널의 값을 prevChannel에 저장한다.
			this.prevChannel = this.channel;
			
			this.channel = channel;
			System.out.println("채널 설정"+channel);
			return;
		}
		System.out.println("유효하지 않은 값입니다");
	}
	
//	7-11에 추가된 method. 이전에 보던 채널로 돌아간다.
	public void gotoPrevChannel(){
		setChannel(prevChannel);
	}
	
	public int getVolume(){
		return this.volume;
	}
	public int getChannel(){
		return this.channel;
	}
}
