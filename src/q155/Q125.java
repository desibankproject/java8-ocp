package q155;

class Animal{
	String type="Canine";
	int maxSpeed=60;
	Animal(){}
	public Animal(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}
class WildAnimal extends Animal{
	String bounds;
	WildAnimal(String bounds){
		//line n1
		this.bounds=bounds;
	}
	public WildAnimal(String type, int maxSpeed, String bounds) {
		//line2
		super(type,maxSpeed);
		this.bounds = bounds;
	}
}
//Canine 60 Long
//Feline 80 Short

public class Q125 {
	public static void main(String[] args) {
		WildAnimal wolf=new WildAnimal("Long");
		WildAnimal tiger=new WildAnimal("Feline", 80,"Short");
		System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
		System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);
	}
}
