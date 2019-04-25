package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExampleMain {
	public static void main(String[] args) {
		    List<String> heros=new ArrayList<>();
			heros.add("Nagendra");
			heros.add("Tawin");
			heros.add("Yannis");
			heros.add("Tess");
			Stream<String> stream=heros.stream();
			List<String> list=stream.collect(Collectors.toList());
			System.out.println(list);
			stream.forEach(System.out::println);
	}
}
