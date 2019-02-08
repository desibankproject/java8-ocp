package ocp2;

import java.util.stream.Stream;

public class Q17 {
	 public static void main(String[] args) {
		// Stream<String> stream = Stream.iterate("",(s) -> s + "1");
		 //System.out.println(stream.limit(2).map(x -> x +"2"));
		 //stream.limit(2).map(x -> x +"2").forEach(System.out::println);
		 Stream<Integer> stream = Stream.iterate(1,(s) -> s +2);
		// System.out.println(stream.limit(2).map(x -> x *1));
		 stream.limit(5).map(x -> x *1).forEach(System.out::println);
	 }
}
