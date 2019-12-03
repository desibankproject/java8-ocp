package functional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<String> optional=check("Nagendra");
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		optional.ifPresent(System.out::println);
		optional.ifPresent((String t)->System.out.println(t));
	}
	
	public static	Optional<String> check(String name){
		if(name.isEmpty()) {
			return Optional.empty();
		}else {
			return Optional.of(name);
		}
	}
}
