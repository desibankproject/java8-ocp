package method.ref;

@FunctionalInterface
interface Vehicle {
	public void run(String name);
}

class Car{
	public void horn(String name) {
		System.out.println("Horn please  = "+name);
	}
}

public class MinhInstanceMethod {
	
	public static void main(String[] args) {
		
		Car car=new Car();
		Vehicle vehicle1=new Vehicle() {
			@Override
			public void run(String name) {
					car.horn(name);
			}
		};
		
		Vehicle vehicle2=(String name) -> {
					car.horn(name);
			};
		
		Vehicle vehicle3=(String name) ->car.horn(name);
		Vehicle vehicle4=car::horn;
		
		vehicle3.run("Sound!!!");
	}

}
