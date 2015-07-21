package lab_shipping;

public class Truck extends Vehicle{

	Truck(double tripDistance, double fuelEfficiency){
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
