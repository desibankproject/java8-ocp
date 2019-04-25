package j8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MinExample {
	public static void main(String[] args) {
		Stream<String> s=Stream.of("monkey","gorilla","bonobo");
		Optional<String> optional=s.min((s1,s2)->s1.length()-s2.length());
		optional.ifPresent(System.out::println);
	}
}
