package lab_shipping;

import java.util.ArrayList;

public class GenerateReport {

	Company company = Company.getInstance();
	
	public Object generateFuelNeeds() {
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
		double total = 0.0;
		
		for(int i=0; i<vList.size(); i++){
			total += vList.get(i).calcFuelNeeds();
		}
		return total;
	}

}
