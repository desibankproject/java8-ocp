package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpperBoundExample {
	
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
		
		List<Robot> robots=new ArrayList<Robot>();
		Robot robot=new Robot();
		robot.setColor("white");
		robot.setFuelType("petrol");
		robot.setPrice(1233);
		robots.add(robot);
		//print(cars);
		//print(robots);
		//List<Vehicle> oeoe=new ArrayList<Car>();
		List<Vehicle> vehicles=new ArrayList<Vehicle>();
		Vehicle vehicle=new Vehicle();
		vehicle.setColor("white");
		vehicle.setFuelType("petrol");
		vehicle.setPrice(1233);
		vehicles.add(vehicle);
		print(vehicles);
		print(robots);
		print(cars);
		//null instanceof Object - false
	}
	
	static public void print(List<? extends Vehicle> vehicles){//Arr // vehicles can refer List of Vehicle or List of  anysubclass of Vehicle
		//List<Car> cars=new ArrayList<Car>();
		vehicles.add(null);
		Vehicle pt=new Vehicle();
		pt.setColor("pink");
		pt.setFuelType("petrol");
		pt.setPrice(2342);
		//we cannot add any element inside it except null
		//vehicles.add(pt);
		
		for(Vehicle vehicle:vehicles) {
			System.out.println(vehicle);
		}
	}

}
