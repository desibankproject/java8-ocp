package ocp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q23 {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		System.out.println(list);
		System.out.println(sort(list));
		System.out.println(list);
		
	}
	private static List<String> sort(List<String>list) {
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
		/* return list.stream()
				 .compare((a, b) -> b.compareTo(a))
				 .sort();*/
	}
}
