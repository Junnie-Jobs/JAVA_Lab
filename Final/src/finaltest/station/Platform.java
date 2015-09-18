package station;

import java.util.PriorityQueue;

import passenger.Passenger;

public class Platform {

	private static final int TRAIN_TERM = 3;
	private static PriorityQueue<Passenger> trainWaitingQueue;
	
	public static void addTrainQueue(Passenger p){
		trainWaitingQueue.add(p);
	}
	
}
