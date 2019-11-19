package j8.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMapsDemo2 {

	public static void main(String[] args) {
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, k ->
		k)); // BAD
	}
}
