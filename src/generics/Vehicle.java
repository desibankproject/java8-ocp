package generics;

public class Vehicle extends Motor {
	String color;
	int price;

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
		return "Vehicle [color=" + color + ", price=" + price + "]";
	}

}
