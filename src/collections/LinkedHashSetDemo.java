package collections;

import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		//TreeSet does not allow null
		Set<Integer> integers=new TreeSet<Integer>(); //0
		integers.add(10);
		integers.add(10);
		integers.add(30);
		integers.add(40);
		integers.add(20);
		//integers.add(null);
		integers.add(50);
		for(Integer x :integers) {
			 System.out.println(x);
		}
 	}
}
