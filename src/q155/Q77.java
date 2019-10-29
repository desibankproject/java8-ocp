package q155;

import java.util.Arrays;
import java.util.List;

public class Q77 {
	public static void main(String[] args) {
		 List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		// long p=listVal.stream().map(x -> x.length()>3).count() ;
		 long p=listVal.stream().filter(x -> x.length()>3).count(); 
		 System.out.println(p);
		 System.out.println (
				 // line n1
				 listVal.stream().map(x -> x.length()>3).count()
				);
		 
	}
}
