package ocpq155;

import java.util.function.Supplier;

class Bird {
	public void fly() {
		System.out.print("Can fly");
	}
}

class Penguin extends Bird {
	public void fly() {
		System.out.print("Cannot fly");
	}
}

public class Q148 {
	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);
	}
	 static void fly (Supplier<? extends Bird> supplier) {
		 supplier.get().fly();
	 }
	 
	/* line n1 */
}
