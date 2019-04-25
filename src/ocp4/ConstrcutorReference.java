package ocp4;

import java.util.function.Consumer;

public class ConstrcutorReference {
	public static void main(String[] args) {
		Consumer<String> c=s->new String(s);
		c.accept("coper");
		
		Consumer<String> c1 = System.out::println;
		c1.accept("Hello");
	}
}
