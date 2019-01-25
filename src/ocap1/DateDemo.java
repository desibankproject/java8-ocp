package ocap1;

import java.time.LocalDate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DateDemo {
	public static void main(String[] args) {
		Stream<LocalDate> s = Stream.of(LocalDate.now());
		System.out.println(s);
		UnaryOperator<LocalDate> u = l -> l;
		s.peek(System.out::println).filter(l -> l !=null).peek(System.out::println).map(u).peek(System.out::println);
	}
}
