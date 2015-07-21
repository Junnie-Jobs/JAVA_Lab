package lab_shipping;

public abstract class Vehicle {

	private double tripDistance;
	private double fuelEfficiency;
	
	public abstract double calcTripDistance();
	public abstract double calcFuelEfficiency();
	
	public final double calcFuelNeeds(){
		return calcTripDistance()/calcFuelEfficiency();
	}
	
	Vehicle(double tripDistance, double fuelEfficiency){
		this.tripDistance = tripDistance;
		this.fuelEfficiency = fuelEfficiency;
	}
}
