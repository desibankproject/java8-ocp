package j8.stream;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMapsDemo6 {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, Set<String>> map = ohMy.collect(
		 Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(map); // {5=[lions, bears], 6=[tigers]}

	}
}
