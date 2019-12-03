package j8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorJoiningDemo {

public static void main(String[] args) {
	Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
	//String result = ohMy.collect(Collectors.joining());
	//String result = ohMy.collect(Collectors.joining(", "));
	String result = ohMy.collect(Collectors.joining(", ","Mr. "," Welcome"));
	System.out.println(result); // lions, tigers, bears
}
}
