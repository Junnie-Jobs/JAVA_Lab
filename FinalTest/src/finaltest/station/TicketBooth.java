package finaltest.station;

import java.util.Iterator;
import java.util.PriorityQueue;

import finaltest.passenger.Passenger;
import finaltest.policy.ShortReadyTimePolicy;
import finaltest.policy.TicketingTimePolicy;


public class TicketBooth {

	private static final int STAFF_MAX = 3;
	private PriorityQueue<Passenger> waitingQueue;
	private Staff[] staffLists = new Staff[STAFF_MAX];
	
	public TicketBooth() {
		waitingQueue = new PriorityQueue<Passenger>(50, new ShortReadyTimePolicy());
		for(int i=0; i<STAFF_MAX; i++){
			staffLists[i] = new Staff(this);
		}
	}
	
	public void doTicketing(){
		for(int i=0; i<STAFF_MAX; i++){
			staffLists[i].doWork();
		}
	}
	
	public void addWaitingQueue(Passenger c){
		waitingQueue.add(c);
	}
	public Passenger getWaitingPassenger(){
		return waitingQueue.poll();
	}
	
	public void showTicketing(){
		System.out.println("============= Æ¼ÄÏÆÃ ÁßÀÎ ½Â°´ =============");
		for(int i=0; i<STAFF_MAX; i++){
			staffLists[i].showMyPassenger();
		}
		System.out.println();
	}
	public void showReadyQueue(){
		System.out.println("============= ºÎ½º ´ë±â ½Â°´ =============");
		Iterator<Passenger> iter = waitingQueue.iterator();
		while(iter.hasNext()){
			Passenger c = iter.next();
			System.out.print(c + ", Æ¼ÄÉÆÃ ´ë±â : " +c.getTicketingReady()+"ºÐ\n");
		}
		System.out.println();
	}
}
