package finaltest.station;

import finaltest.Main;
import finaltest.passenger.Passenger;

public class Staff {

	private boolean isWork;
	private TicketBooth booth;
	private Passenger myPassenger;
	private int startTime;
	private int timeToEnd;
	private Platform platform;

	public Staff(TicketBooth booth){
		platform = Platform.getInstance();
		this.isWork = false;
		this.booth = booth;
	}
	
	public void doWork(){
		if(!isWork){
			getNextPassenger();
			return;
		}else{
			if((timeToEnd == Main.curTime)){
				completeTicketing();
				getNextPassenger();
				return;
			}
			return;
		}
	}
	
	public void showMyPassenger(){
		if(myPassenger == null)
			return;
		System.out.println("[Working] "+myPassenger);
	}
	
	private void getNextPassenger(){
		myPassenger = booth.getWaitingPassenger();
		if(myPassenger == null)
			return;
		
		isWork = true;
		startTime = Main.curTime;
		timeToEnd = myPassenger.getTicketingTime() + startTime;
	}
	
	private void completeTicketing(){
		isWork = false;
		platform.addTrainWaitingQueue(myPassenger);
		myPassenger = null;
	}
}
