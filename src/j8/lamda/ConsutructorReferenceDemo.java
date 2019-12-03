package j8.lamda;

interface VehicleFactory{
	public Vehicle build(String name,String color);
}

public class ConsutructorReferenceDemo {
	public static void main(String[] args) {
		
		/*VehicleFactory factory=new VehicleFactory() {
			@Override
			public Vehicle build(String name, String color) {
				return new Vehicle(name, color);
			}
		}; */
		
/*		VehicleFactory factory=(String name, String color)-> {
				return new Vehicle(name, color);
			};*/
		
		/*VehicleFactory factory=(name,color)-> {
			return new Vehicle(name, color);
		};*/
		
		/*VehicleFactory factory=(String name, String color)-> new Vehicle(name, color);*/
		
		VehicleFactory factory=Vehicle::new;
		Vehicle vehicle=factory.build("Audi", "yellow");
		System.out.println(vehicle);
	}
}
