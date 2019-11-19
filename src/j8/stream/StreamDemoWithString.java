package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemoWithString {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Nagendra","James","Aaron","Jack","Nagendra");
		Stream<String>  stream=names.stream();
		
		List<String> output=stream.map(String::toUpperCase).collect(Collectors.toList());
		output.forEach(System.out::println);
	}
	
}
