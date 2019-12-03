package q155;

interface Rideable {
	Car getCar(String name);
}

class Car {
	private String name;
	public Car(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}

public class Q135 {
	
	public static void main(String[] args) {
		Rideable rideable=Car::new;
		Car t=rideable.getCar("Tata");
		System.out.println(t);
		//Car auto = Car::new; //The target type of this expression must be a functional interface
		 //Car auto = Car("MyCar")::new; //The method Car(String) is undefined for the type Q135
		//Car vehicle = Rideable::new::getCar("MyCar"); //The left-hand side of an assignment must be a variable
	}

}
