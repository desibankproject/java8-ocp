package conncurrent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
		
	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
		Stream<Integer> parallelStream = stream.parallel();
		List<String> names=Arrays.asList("Nagendra","Nai","Arnab","James","Ameya","Back");
		Stream<String> stream2=names.parallelStream();
		int processor=Runtime.getRuntime().availableProcessors();
		System.out.println(processor);
		Arrays.asList(1,2,3,4,5,6)
		.stream()
		.forEach(s -> System.out.print(s+" "));
		System.out.println("\n\n\nExample of parallel stream!");
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEach(s -> System.out.print(s+" "));
		
		System.out.println("@)@)@)@");
		Arrays.asList("jackal","kangaroo","lemur","nagendra")
		.parallelStream()
		.map(s -> {
			System.out.println("s = "+s);
			System.out.println(Thread.currentThread().getName());
			return s.toUpperCase();
			})
		.forEach(System.out::println);
	}
}
