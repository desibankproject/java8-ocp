package ocpq155;

class Vehicle{
	String type="4w";
	int maxSpeed=100;
	Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class Car extends Vehicle{
	String trans;
	public Car(String trans){ //line1
		super("@",12);
		this.trans=trans;
	}
	public Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		//this(trans);//line2
	}
}
public class Q153 {
	public static void main(String[] args) {
		Car c1=new Car("Auto");
		Car c2=new Car("4W",150,"Manual");
		System.out.println(c1.type+" " + c1.maxSpeed+ " " + c1.trans);
		System.out.println(c2.type+" " + c2.maxSpeed+ " " + c2.trans);
	}
}
