package station;

import java.util.PriorityQueue;

import passenger.Passenger;
import policy.TicketingTimePolicy;

public class TicketBooth {

	private static final int STAFF_MAX = 3;
	private PriorityQueue<Passenger> waitingQueue;
	private Staff[] staffLists = new Staff[STAFF_MAX];
	
	public TicketBooth() {
		waitingQueue = new PriorityQueue<Passenger>(100, new TicketingTimePolicy());
		for(int i=0; i<STAFF_MAX; i++){
			staffLists[i] = new Staff(this);
		}
	}
	
	public void doTicketing(){
		
	}
	
	
	public void addWaitingQueue(Passenger c){
		waitingQueue.add(c);
	}
	public Passenger getWaitingPassenger(){
		return waitingQueue.poll();
	}
	public void showQueue(){
		System.out.println(waitingQueue);
	}
}
