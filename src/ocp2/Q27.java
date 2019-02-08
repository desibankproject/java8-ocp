package ocp2;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q27 {
	public static void main(String[] args) {
		Stream.iterate(1, x -> x++).limit(5).map(x ->x+"").collect(Collectors.joining());
	}
}
