package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AccessSteramElements {
	 //Optional	
	 public static void main(String[] args) {
		 Stream<String> ss = Stream.iterate("", (s) -> s + "1").limit(5);
		 ss.forEach(System.out::println);
		    List<String> heros=new ArrayList<>();
		    heros.add("");
			heros.add("Nagendra");
			heros.add("Tawin");
			heros.add("Yannis");
			heros.add("Mocks");
			Stream<String> stream=heros.stream();
			System.out.println(stream);
			Stream<String> temp=stream.filter(t->t.length()>5);
			heros.add("Jocker");
			System.out.println(temp);
			temp.forEach(System.out::println);
			
			Stream<String> tstream=heros.stream();
			tstream.forEach(System.out::println);
			
			
	 }
}
