package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.function.Predicate;

public class MethodReferencePredicate {

	public static void main(String[] args) {
		/*Predicate<String> pred=(String t)->t.isEmpty();*/
		Predicate<String> pred=String::isEmpty;
		ExecutorService
	List<String> lista=new ArrayList<String>();
		lista.add("Nagendra");
		lista.add("Mango");
		lista.add("");
		lista.add("James");
		lista.add("Minh");
		lista.add("Meng");
		lista.add("Apple");
		lista.removeIf(String::isEmpty);
		
	}
}
