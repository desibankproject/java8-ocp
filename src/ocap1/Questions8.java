package ocap1;

import java.util.Optional;
import java.util.stream.Stream;

public class Questions8 {
	private static void magic(Stream<Integer> s) {
		Optional<Integer> o = s.filter(x -> x < 5).limit(3).max((x, y)-> x>y?x:y);
		System.out.println("Ahahah!");
		if(o.isPresent()){
			System.out.println(o.get());
		}else{
			System.out.println(o.get());
		}
	
	}
	public static void main(String[] args) {
		magic(Stream.empty()); 
	}
}
