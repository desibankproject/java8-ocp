package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author nagendra.yadav
 * 
 */
public class HashSSetDemo {

	public static void main(String[] args) {

		// Generic Declaration
		// collection classes can be used as container for other objects.
		Set<String> set = new HashSet<String>(); //16
		set.add("Apple");
		set.add("Mango");
		set.add("Orange");
		set.add("Banana");
		set.add("Papaya");
		set.add("Papaya");
		set.add("Papaya");
		set.add("Papaya"); //1 lac
		set.add("Papaya");
		set.add("Papaya");
		set.add("Papaya");
		//new capacity = (old capacity*3)/2 +1 = 16

		// size of list
		System.out.println("############################");
		// I want to access it.
		Iterator<String> it = set.iterator();
		//Iterator can be used to access any collection which implements Collection interface
		while (it.hasNext()) {
			String element = it.next();
			//list.add("I have tested it!!");
			System.out.println("Arun = " + element);
		}

		System.out.println("############################");

		// retrieving all the elements.jdk 1.5
		for (String str : set) {
			System.out.println("1 = " + str);
		}

	}
}
