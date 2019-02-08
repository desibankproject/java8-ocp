package ocp2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Q28 {
	public static void main(String[] args) {
		Consumer<String> x = String::new;
		BiConsumer<String, String> y = (a, b) -> System.out.println();
		Function<String, String> z = a -> a + a;
	}
}
