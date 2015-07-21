package company;

import java.util.ArrayList;

public class Company {

//	싱글톤 생성
	private static Company instance = new Company();
	
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance;
	}
	
	private Company(){}
	
	private ArrayList<Employee> eList = new ArrayList<Employee>();
	
	public void addEmployee(Employee e){
		eList.add(e);
	}
	public ArrayList<Employee> getList(){
		return eList;
	}
	
}
