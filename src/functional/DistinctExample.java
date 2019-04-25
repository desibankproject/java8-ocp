package functional;

import java.util.ArrayList;
import java.util.List;

public class DistinctExample {
	public static void main(String[] args) {
		List<String> heros = new ArrayList<>();
		heros.add("");
		heros.add("Nagendra");
		heros.add("Tawin");
		heros.add("Yannis");
		heros.add("Yannis");
		heros.add("Tess");
		// why we cannot use method reference here
		heros.stream().map(String::length).forEach(System.out::println);
	}
}
