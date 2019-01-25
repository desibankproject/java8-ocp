package ocap1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Q68HashSet {
	public static void main(String[] args) {
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(75);
		numbers.add(new Integer(86));
		numbers.add(null);
		numbers.add(309L);
		Iterator iter = numbers.iterator();
		while (iter.hasNext()){
			//Number asdad=iter.next();
			 System.out.print(iter.next());
		}
}
}




