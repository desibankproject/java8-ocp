package j8.lamda;

public class Vehicle {
	private String name;
	private String color;

	public Vehicle() {

	}

	public Vehicle(String name) {
		this(name, "white");
	}

	public Vehicle(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + "]";
	}

	
}
