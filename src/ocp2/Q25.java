package ocp2;

import java.util.stream.Stream;

public class Q25 {
	public static void main(String[] args) {
		Stream.generate(() -> "1").limit(10).peek(System.out::println)
		.filter(x -> x.length() > 1)
		 .forEach(System.out::println);
	}
}
