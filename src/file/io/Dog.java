package file.io;

import java.io.Serializable;

public class Dog implements Serializable{
	transient private String name;
	private String color;
	private int price;
	
	public Dog() {
		
	}

	public Dog(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
