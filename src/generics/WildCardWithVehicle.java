package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardWithVehicle {
	
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
		//Collections.shuffle(list);
		print(cars);
		//List<Vehicle> oeoe=new ArrayList<Car>();
	}
	
	//List<?> vehicles = vehicles can reference ArrayList of any type
	static public void print(List<?> vehicles){//Arr
		Object[] data=vehicles.toArray();
		for(Object ob:data){
			if(ob instanceof Car){
				Car car=(Car)ob;
				car.run();
			}
		}
	}

}
