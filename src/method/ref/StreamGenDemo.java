package method.ref;

import java.util.stream.Stream;

public class StreamGenDemo {
	public static void main(String[] args) {
			Stream<Integer> stream=Stream.generate(()->10); //infinite
			stream=stream.map(t->t*2);
			stream.limit(20).forEach(System.out::println);
	}
}
