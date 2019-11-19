package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStringCollect2 {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Nagendra","James","Aaron","Jack","Nagendra");
		Stream<String>  stream=names.stream();
		
		Set<String> output=stream.map(String::toUpperCase).collect(Collectors.toSet());
		output.forEach(System.out::println);
		
	}
	
}
