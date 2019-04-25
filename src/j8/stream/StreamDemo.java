package j8.stream;

import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);
		stream2.limit(10).forEach(System.out::println);
	}
}
