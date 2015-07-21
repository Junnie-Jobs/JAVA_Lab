package company;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c = Company.getInstance();
		
		c.addEmployee(new Manager("Tomas", "personal"));
		c.addEmployee(new Manager("Edward", "Finance"));
		c.addEmployee(new Secretary("Lee", "James"));
		
		Information info = new Information();
		info.getinfo();
	}

}
