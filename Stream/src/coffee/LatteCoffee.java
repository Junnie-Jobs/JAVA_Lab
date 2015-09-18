package coffee;

public class LatteCoffee extends Decorator{
	
	public LatteCoffee(Coffee coffee){
		super(coffee);
	}
	
	@Override
	public void brewing(){
		super.brewing();
		System.out.println("Adding Milk");
	}
}