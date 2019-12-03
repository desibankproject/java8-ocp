package j8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		Stream<String> streams=Arrays.asList("Nagendra","Jhon","James","Amogh").stream();
		/*streams.forEach(s->System.out.println(s));*/
		streams.forEach(System.out::println);
		
	}

}
