package lab_shipping;

import java.util.ArrayList;

public class Company {

	private static Company company = new Company();
	
	private Company(){};
	
	public static Company getInstance(){
		if(company == null)
			company = new Company();
		return company;
	}

	ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		vList.add(vehicle);
	}
}
