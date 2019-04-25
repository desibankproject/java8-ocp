package functional;

import java.util.Optional;

public class OptionalChainDemo {
	public static void main(String[] args) {
		Optional<String> optional=Optional.of("Nagendra");
   	    Optional<Integer> result = optional.map(String::length);
   	    result.ifPresent(System.out::println);
	}
	
	private static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                 .filter(s -> s.length() == 3) // part 2
                       .ifPresent(System.out::println); // part 3
	}
}
