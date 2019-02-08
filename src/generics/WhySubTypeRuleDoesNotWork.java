package generics;

import java.util.ArrayList;
import java.util.List;

public class WhySubTypeRuleDoesNotWork {
	
	public static void main(String[] args) {
		List<Car> cars=new ArrayList<Car>();
		Car car1=new Car();
		car1.setColor("white");
		car1.setFuelType("petrol");
		car1.setPrice(1233);
		
		Car car2=new Car();
		car2.setColor("red");
		car2.setFuelType("gas");
		car2.setPrice(23423);
		cars.add(car1);
		cars.add(car2);
		
		//print(cars);
		//List<Vehicle> oeoe=new ArrayList<Car>();
	}
	
	static public void print(List<Vehicle> vehicles){//Arr
	
	}

}
