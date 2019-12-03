package conncurrent;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorDemo {

	public static void main(String[] args) {
		 List<Integer> numbers=Arrays.asList(19,283,927,192,282);
		Set<Integer> numbersWithoutDups = numbers.stream().collect(Collectors.toSet());
		System.out.println(numbersWithoutDups);
		
		Map<Integer, String> intToString 
        = numbersWithoutDups.stream()
                            .collect(Collectors.toMap(Function.identity(),
                                                      String::valueOf));
	}
}
