package q155;

final class TIceCream {

	public void prepare() {
	}
}

class TCake {

	public final void bake(int min, int temp) {
	}

	public void mix() {
	}

}

class TShop {

	private TCake c = new TCake();

	private final double discount = 0.25;

	public void makeReady() {
		c.bake(10, 120);
	}

}

 class TBread extends TCake {
	public void bake(int minutes, int temperature) {
	}
	public void addToppings() {
	}
}

public class Q7 {

}
