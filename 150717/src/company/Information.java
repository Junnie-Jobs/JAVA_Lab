package company;

public class Information {
	
	Company c = Company.getInstance();
	
	public void getinfo(){
		
		for(int i=0; i<c.getList().size(); i++){
			System.out.println(c.getList().get(i).showInfo());
		}
	}
}
