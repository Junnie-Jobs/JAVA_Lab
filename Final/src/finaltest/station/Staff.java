package station;

import finaltest.Main;
import passenger.Passenger;

public class Staff {

	private boolean isWork;
	private TicketBooth booth;
	private Passenger myPassenger;
	private int startTime;
	private int timeToEnd;

	public Staff(TicketBooth booth){
		this.isWork = false;
		this.booth = booth;
	}
	
	public void doWork(){
		if(!isWork){
			isWork = true;
			myPassenger = booth.getWaitingPassenger();
			
			startTime = Main.curTime;
			timeToEnd = myPassenger.getTicketingTime() + startTime;
			return;
		}
		if((timeToEnd == Main.curTime) && isWork){
			Platform.addTrainQueue(myPassenger);
			return;
		}
	}
}
