package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListPredicateDemo {

	public static void main(String[] args) {
		
		List<String> lista=new ArrayList<String>();
		lista.add("Nagendra");
		lista.add("Mango");
		lista.add("Xray");
		lista.add("James");
		lista.add("Minh");
		lista.add("Meng");
		lista.add("Apple");
		
		//Predicate<String> pred=t-> t.contains("a");
		lista.removeIf(k-> k.contains("a"));
		System.out.println(lista);
				
	}
	
}
