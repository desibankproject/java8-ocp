package file.io;

import java.io.Serializable;

public class Car implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String color;
	transient private int price;
	private static transient  String location="India";
	
	public Car() {
		location="USA";
	}

	@Override
	public String toString() {
		System.out.println("location = "+location);
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	public Car(String name, String color, int price) {
		super();
		location="USA";
		this.name = name;
		this.color = color;
		this.price = price;
	}
}
