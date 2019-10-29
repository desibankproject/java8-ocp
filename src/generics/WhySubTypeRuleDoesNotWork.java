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
	}
	
	static public void print(List<Vehicle> vehicles){//Arr // vehicles can refer only List of Vehicle not any subclass of it
		for(Vehicle vehicle:vehicles) {
			System.out.println(vehicle);
		}
	}

}
