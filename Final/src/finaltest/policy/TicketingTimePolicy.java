package policy;

import passenger.Passenger;

public class TicketingTimePolicy implements IPolicy{

	@Override
	public int compare(Passenger p1, Passenger p2) {
		if(p1.getArrivalTime() > p2.getArrivalTime()){
			return 1;
		}
		return -1;
	}
}
