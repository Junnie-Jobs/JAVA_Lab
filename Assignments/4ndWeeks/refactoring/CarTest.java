package refactoring;

import java.util.ArrayList;

public class CarTest {

public static void main(String[] args) {
	

	ArrayList<Car> carList = new ArrayList<Car>();
	
	Car sonata = new Sonata();
	Car genesis = new Genesis();
	Car grandeur = new Grandeur();
	Car avante = new Avante();
	
	carList.add(sonata);
	carList.add(genesis);
	carList.add(grandeur);
	carList.add(avante);
	
	for(Car c : carList)
	{
		c.launcher();
	}
	
}
	
	
}
