package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
	public static void main(String[] args) {
		Set<Integer> integers=new LinkedHashSet<Integer>(); //16
		integers.add(10);
		integers.add(10);
		integers.add(20);
		integers.add(null);
		integers.add(30);
		integers.add(40);
		integers.add(50);
		for(Integer x :integers) {
			 System.out.println(x);
		}
 	}
}
