package j8.stream;

import java.util.stream.Stream;

public class AnyMatchDemo {
	public static void main(String[] args) {
		Stream<String> infinit=Stream.generate(()->"chimp");
	//	infinit.forEach(System.out::println);
		Stream<String> ss1=infinit.limit(8);
		System.out.println("@(@(@(@(@Only one");
		Stream<String> ss2=ss1;
		//ss2.forEach(System.out::println);
	//	ss1.forEach(System.out::println);
	}
}
