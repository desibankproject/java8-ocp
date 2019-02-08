package ocp2;

import java.util.stream.Stream;

public class Q22 {
	public static void main(String[] args) {
		Stream<String> s = Stream.generate(() ->"meow");
		boolean match = s.allMatch(String::isEmpty);
		System.out.println(match);
	}
}
