package conncurrent;

import java.util.Arrays;

public class ParallelStreamDemo2 {
	public static void main(String[] args) {
		System.out.println("Available Processors   = "+Runtime.getRuntime().availableProcessors());
		Arrays.asList("Jackal","Kangaroo","Lemur","Nagendra","Main","Kokla")
		.parallelStream()
		.map(s -> {
			System.out.println("Calling thread - "+Thread.currentThread().getName()+" & processing data is "+s);	
			return s.toUpperCase();
		})
		.forEach(System.out::println);
	}
}
