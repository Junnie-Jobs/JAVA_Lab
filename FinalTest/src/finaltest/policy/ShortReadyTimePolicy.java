package finaltest.policy;

import finaltest.passenger.Passenger;

public class ShortReadyTimePolicy implements IPolicy{

	@Override
	public int compare(Passenger p1, Passenger p2) {
		return p2.getTicketingReady() - p1.getTicketingReady();
	}
}
