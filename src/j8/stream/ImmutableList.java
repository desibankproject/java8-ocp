package j8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImmutableList {
	public static void main(String[] args) {
		List<String> namesList=Arrays.asList("Nagendra","Tess","Lu");
		
		namesList.forEach(System.out::println);
		
		Stream<String> newStream=namesList.stream().map(t->"Hey! "+t);
		newStream.forEach(System.out::println);
		Runtime.getRuntime().availableProcessors();
	
	}
}
