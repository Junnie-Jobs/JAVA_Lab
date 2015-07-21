package company;

public class Secretary extends Employee {

	private String bossName;
	
	Secretary(String name, String bossName){
		super(name);
		this.bossName = bossName;
	}
	
	public String showInfo(){
		return super.showInfo()+", bossname : "+bossName;
	}
}
