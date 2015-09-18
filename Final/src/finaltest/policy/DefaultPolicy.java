package policy;

import passenger.Passenger;

public class DefaultPolicy implements IPolicy{

	@Override
	public int compare(Passenger p1, Passenger p2) {
		if(p1.getId() > p2.getId()){
			return 1;
		}
		return -1;
	}

}
