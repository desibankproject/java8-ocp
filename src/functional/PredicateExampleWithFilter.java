package functional;

import java.util.ArrayList;
import java.util.List;

public class PredicateExampleWithFilter {

	 public static void main(String[] args) {
		    List<String> heros=new ArrayList<>();
		    heros.add("");
			heros.add("Nagendra");
			heros.add("Tawin");
			heros.add("Yannis");
			heros.add("Tess");
			//why we cannot use method reference here
			heros.stream().filter(x->x.startsWith("T")).forEach(System.out::println);
			//heros.stream().filter(x->x.isEmpty()).forEach(System.out::println);;
			heros.stream().filter(String::isEmpty).forEach(System.out::println);
			
	}
}
