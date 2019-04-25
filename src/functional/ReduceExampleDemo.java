package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExampleDemo {
	public static void main(String[] args) {
		    List<String> heros=new ArrayList<>();
			heros.add("Nagendra");
			heros.add("Tawin");
			heros.add("Yannis");
			heros.add("Tess");
			Stream<String> stream=heros.stream();
			String result=stream.reduce("", (first,second)->first+second);
			System.out.println(result);
	}
}
