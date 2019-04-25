package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCountExample {

			 public static void main(String[] args) {
				    List<String> heros=new ArrayList<>();
				    heros.add("");
					heros.add("Nagendra");
					heros.add("Tawin");
					heros.add("Yannis");
					heros.add("Tess");
					//why we cannot use method reference here
					Stream<String> stream=heros.stream();
					heros.add("Jackesh");
					System.out.println(stream.count());
					heros.add("Munesh");
					System.out.println(stream.count());

	}
}
