package j8.stream;

import java.util.stream.Stream;

public class StreamSortedDemo {

	public static void main(String[] args) {
		
		Stream<String>  stream=Stream.of("Nagendra","James","Aaron","Jack");
		stream.sorted().forEach(System.out::println);
		
	}
	
}
