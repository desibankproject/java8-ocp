package method.ref;

import java.util.stream.Stream;

public class StreamIterateDemo {
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.iterate(10,x->x+1); //infinite
		stream.limit(20).forEach(System.out::println);
	}
}
