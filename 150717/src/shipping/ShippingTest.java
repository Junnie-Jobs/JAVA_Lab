package shipping;

import junit.framework.TestCase;
import lab_shipping.Company;
import lab_shipping.GenerateReport;
import lab_shipping.RiverBarge;
import lab_shipping.Truck;

public class ShippingTest extends TestCase{

	public void testShipping(){
		
		Company company = Company.getInstance();
		
		company.addVehicle(new Truck(500,50));
		company.addVehicle(new Truck(100,20));
		company.addVehicle(new RiverBarge(300,10));
		company.addVehicle(new RiverBarge(300,10));
		company.addVehicle(new Truck(250,50));
		
		GenerateReport report = new GenerateReport();
		assertEquals( 80 ,report.generateFuelNeeds());
	}
}
