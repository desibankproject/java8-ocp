package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithDog2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dog dog1 = new Dog("bulldog", "black", 3000);
		Dog dog2 = new Dog("tommy", "white", 300);
		Dog dog3 = new Dog("joby", "yellow", 33);
		Dog dog4 = new Dog("jhony", "green", 444);
		Dog dog5 = new Dog("jabber", "orange", 555);

		DogNameComparator dogNameComparator=new DogNameComparator();
		// default capacity 0
		Set<Dog> dogsBucket = new TreeSet<Dog>(dogNameComparator);
		dogsBucket.add(dog1);
		dogsBucket.add(dog2);
		dogsBucket.add(dog3);
		dogsBucket.add(dog4);
		dogsBucket.add(dog5);
		dogsBucket.add(dog5);
		dogsBucket.add(dog5);

		Iterator<Dog> it = dogsBucket.iterator();
		// Iterator can be used to access any collection which implements
		// Collection interface
		while (it.hasNext()) {
			Dog element = it.next();
			// list.add("I have tested it!!");
			System.out.println("xxxxx = " + element);
		}
		// retrieving all the elements.jdk 1.5
		for (Dog dog : dogsBucket) {
			System.out.println("yyyyy = " + dog);
		}

	}

}
