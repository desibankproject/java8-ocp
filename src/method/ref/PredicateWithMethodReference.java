package method.ref;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class PredicateWithMethodReference {

	public static void main(String[] args) {
		/* Predicate<String> eee=s->s.isEmpty(); */
		
		Predicate<String> eee2=String::isEmpty;
		//Predicate<String> eee=String::concat;
	
		/*
		 * BiFunction<String,String,String> bifi=new BiFunction<String, String,
		 * String>() {
		 * 
		 * @Override public String apply(String t, String u) { return t.concat(u); } };
		 */
		
		/* BiFunction<String,String,String> bifi=(String t, String u) -> t.concat(u); */
		
		BiFunction<String,String,String> bifi=String::concat;
		
	}
	
}
