package subclassing;

public class Employee {
	
	public String name;
	public int sabun;
	protected double salary;
	public int num = 10;
	
	
	public Employee(){}
	public Employee(String name){
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
	public String getDetail(){
		return name + "," + salary + "," + sabun;
	}
}
