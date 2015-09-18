package coffee;

public class Decorator extends Coffee{

	Coffee coffee;

	public Decorator(Coffee coffee){
		this.coffee = coffee;
	}
	
	public void brewing(){
		coffee.brewing();
	}
}
