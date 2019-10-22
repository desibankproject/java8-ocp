package j8.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MinExample {
	public static void main(String[] args) {
		Stream<String> s=Stream.of("monkey","gorilla","bonobo");
		//Comparator<String>  comp=(s1,s2)-> 
		//min, max , sort
		Optional<String> optional=s.min((s1,s2)->s1.length()-s2.length());//Comparator
		if(optional.isPresent()) {
			String sss=optional.get();
		}else {
			
		}
		optional.ifPresent(t->System.out.println(t));
	}
}
