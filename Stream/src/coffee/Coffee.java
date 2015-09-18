package coffee;

public abstract class Coffee {

	public static void main(String[] args) {
		
		Coffee americano = new Americano();
		americano.brewing();
		//Americano Coffee
		
		Coffee latte = new LatteCoffee(new Americano());
		latte.brewing();
		//Americano Coffee Adding Milk
		
		Coffee mocha = new MochaCoffee(new LatteCoffee(new Americano()));
		mocha.brewing();
		//Americano Coffee Adding Milk Adding Mocha Syrup

	}

	public abstract void brewing();

}
