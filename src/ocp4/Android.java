package ocp4;


import java.util.function.*;

public class Android {

	public void wakeUp(Supplier supplier) { // d1
		supplier.get();
	}

	
	
	public static void main(String... electricSheep) {
		Supplier<Integer> supplier = () -> 100;
		Android data = new Android();
		data.wakeUp(() -> "Program started!"); // d2
	}

}