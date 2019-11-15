package j8.stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamStringCollect {

	public static void main(String[] args) {
		
		Stream<String>  stream=Stream.of("Nagendra","James","Aaron","Jack");
		/* Consumer<String> con=(String s) ->System.out.println(s); */
		//Consumer<String> con=System.out::println; 
		stream.forEach(System.out::println);
		stream.forEach(s->System.out.println(s));
		
	}
	
}
