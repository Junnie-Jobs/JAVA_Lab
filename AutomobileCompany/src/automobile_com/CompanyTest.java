package automobile_com;

public class CompanyTest {

	public static void main(String[] args) {
		SingleCompany company = SingleCompany.getInstance();
		
		company.addCar(new Sonata(), 3);
		company.addCar(new Grandeur(), 2);
		company.addCar(new Genesis(), 1);
		
		CalculatePrice.printResult();

	}

}
