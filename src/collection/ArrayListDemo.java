package collection;

import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		// Generic Declaration
		// collection classes can be used as container for other objects.
		List<String> list = new ArrayList<String>(); //10
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		list.add("Papaya");
		list.add("Papaya");

		//new capacity = (old capacity*3)/2 +1 = 16
		
		Iterator<String> it = list.iterator();
		//Iterator can be used to access any collection which implements Iterable interface
		while (it.hasNext()) {
			String element = it.next();
			System.out.println(element);
		}

		// retrieving all the elements.jdk 1.5
		for (String str : list) {
			System.out.println("1 = " + str);
		}
		// retrieving all the elements.
		// fastest retrieval because access as per index of the array.
		//a[0]
		for (int i = 0; i < list.size(); i++) {
			System.out.println("2 = " + list.get(i));//A[i]
		}

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("4 = " + listIterator.next());
			listIterator.add("Nagendra");
		}

		//searching an element Apple inside the ArrayList
		boolean b=list.contains("Apple"); //complexity  = O(n)
	}
}
