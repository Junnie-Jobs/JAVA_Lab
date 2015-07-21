package lab_shipping;

public class RiverBarge extends Vehicle {

	RiverBarge(double tripDistance, double fuelEfficiency){
		super(tripDistance, fuelEfficiency);
	}
	
	@Override
	public double calcTripDistance() {
		return tripDistance;
	}

	@Override
	public double calcFuelEfficiency() {
		return fuelEfficiency;
	}
}
