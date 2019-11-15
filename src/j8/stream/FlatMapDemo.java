package j8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FlatMapDemo {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Nagendra","James","Aaron","Jack","Nagendra");
		List<String> fruits=Arrays.asList("Apple","Mango","Banana","Papaya","Grapes");
		Set<String> country=new HashSet<>();
		country.add("JK");
		country.add("PK");
	    Stream<List<String>> listStream=Stream.of(names,fruits);
	    Stream<String> merges=listStream.flatMap(list->list.stream());
	    merges.forEach(System.out::println);
	}

}
