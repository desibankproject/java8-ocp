package collection;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author nagendra.yadav
 * 
 */
public class LinkedHashSetBiscuitDemo {

	public static void main(String[] args) {

		//it will maintained the order
		//Please refer this Biscuit class from HashSet
		Set<Biscuit> list = new LinkedHashSet<Biscuit>();
		
		Biscuit biscuit1=new Biscuit(1,"ParleG","sweet","open the packet and eat");
		Biscuit biscuit2=new Biscuit(2,"ParleG","sweet","open the packet and eat");
		Biscuit biscuit3=new Biscuit(3,"ParleG","salty","open the packet and eat");
		Biscuit biscuit4=new Biscuit(4,"ParleG","sweet","open the packet and eat");
		Biscuit biscuit5=new Biscuit(5,"ParleG","salty","open the packet and eat");
		
		list.add(biscuit1);
		list.add(biscuit2);
		list.add(biscuit3);
		list.add(biscuit4);
		list.add(biscuit5);

		// retrieving all the elements.jdk 1.5
		for (Biscuit str : list) {
			System.out.println("output = " + str);
		}
	}
}
