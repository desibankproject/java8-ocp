package inner.cls;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceExample {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		Consumer<String> t=System.out::println;
		//lambda
		//Output : A,B,C,D,E
		items.forEach(item->System.out.println(item));
		
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println);
		
		//method reference
		//Output : A,B,C,D,E
		items.forEach(t);
	}
}
