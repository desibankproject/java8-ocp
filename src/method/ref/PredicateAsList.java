package method.ref;

import java.util.ArrayList;
import java.util.List;

public class PredicateAsList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); //10
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		list.add("Papaya");
		list.add("Papaya");
		
		/*list.removeIf(s->s.isEmpty());*/
		
		list.removeIf(String::isEmpty);
		
		list.removeIf(s->s.length()>0);

	}
}
