package num1;

import java.util.TreeMap;

public class CarFactory {

	private TreeMap<String, Car> tmap = new TreeMap<String, Car>();
	
	private static CarFactory cf = new CarFactory();
	private CarFactory(){};
	
	public static CarFactory getInstance(){
		if(cf == null){
			CarFactory cf = new CarFactory();
			return cf;
		}
		return cf;
	}
	
	public Car createCar(String carname){
		if(hasCar(carname)){
			return tmap.get(carname);
		}
		Car car = new Car(carname);
		tmap.put(carname, car);
		return car;
	}
	
	private boolean hasCar(String carname){
		if(tmap.get(carname) != null){
			return true;
		}
		return false;
	}
}
