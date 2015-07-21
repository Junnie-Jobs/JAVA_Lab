package company;

public class Manager extends Employee {
	
	private String department;
	
	Manager(String name, String department){
		super(name);
		this.department = department;
	}
	
	public String showInfo(){
		return super.showInfo() +","+" department : "+department;
	}
}
