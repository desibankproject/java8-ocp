package ocap1;
enum Flavors {
	VANILLA, CHOCOLATE, STRAWBERRY
}
public class IceCream {

	public static void main(String[] args) {
		Flavors f = Flavors.STRAWBERRY;
		switch (f) {
		case STRAWBERRY:
			System.out.println("vanilla");
		case CHOCOLATE:
			System.out.println("chocolate");
		case VANILLA:
			System.out.println("strawberry");
			break;
		default:
			System.out.println("missing Ûavor");
		}
	}
}
