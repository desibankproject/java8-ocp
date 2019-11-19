package conncurrent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Nagendra","Nai","Arnab","James","Ameya","Back");
		names.forEach(System.out::println);
		
		/*
		 * names .parallelStream() .forEach(s -> System.out.print(s+" "));
		 */
		//Manisha tell me the output of the 
		System.out.println("Output from parallel stream!");
		Stream<String> streams=names.stream();
		System.out.println(streams.isParallel());
		streams.parallel();
		System.out.println(streams.isParallel());
		streams.forEach(System.out::println);
	}
}
