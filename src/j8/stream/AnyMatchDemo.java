package j8.stream;

import java.util.stream.Stream;

public class AnyMatchDemo {
	public static void main(String[] args) {
		Stream<String> infinit=Stream.generate(()->"chimp");
		infinit.limit(8).forEach(System.out::println);
	}
}
