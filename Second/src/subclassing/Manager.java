package subclassing;

public class Manager extends Employee{
	
	public String department;
	public int num = 20;
	
	public Manager(){}
	public Manager(String name){
		super(name);
	}
	
	public String getDetail(){
		return super.getDetail() + "," + department;
	}
}
