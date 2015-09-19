package finaltest.policy;

import finaltest.passenger.Passenger;

public class DefaultPolicy implements IPolicy{

	@Override
	public int compare(Passenger p1, Passenger p2) {
		return p1.getId() - p2.getId();
	}
}
