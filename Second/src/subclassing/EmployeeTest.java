package subclassing;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("Edward");
		e.salary = 100000.0;
		System.out.println(e.getDetail());
		
		Manager m = new Manager("Tomas");
		m.department = "Personal";
		System.out.println(m.getDetail());
		
		Employee em = new Manager("Lee");
		System.out.println(em.getDetail());
		System.out.println(em.num);
		
	}

}
