class Vehicle {
	int price;
	String color;
	public Vehicle(int price, String color) {
		this.price = price;
		this.color = color;
	}
}
class Home extends Vehicle{
	public Home() {
		super(292,"yellow");
		super.price=1202;
		super.color="blue";
		this.color="green";
		this.price=1000;
		price=420;
		color="cyan";
	}
	public void show() {
		System.out.println(super.price);
		System.out.println(this.color);
	}
}
public class Omega {
	public static void main(String[] args) {
		new Home().show();
	}
}
