package company;

public class Employee {

	private String name;
	private double salary;
	private int idNum;
	
	Employee(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getidNum(){
		return idNum;
	}
	
	public String showInfo(){
		return "name : "+name+","+" salary : "+salary+","+" idNum : "+idNum;
	}
}
