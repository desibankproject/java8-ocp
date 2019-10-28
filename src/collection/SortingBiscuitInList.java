package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author nagendra.yadav
 * 
 */
public class SortingBiscuitInList {

	public static void main(String[] args) {

		// Generic Declaration
		// collection classes can be used as container for other objects.
		List<Biscuit> list = new ArrayList<Biscuit>(5);
		Biscuit biscuit1=new Biscuit(1,"ParleG","sweet","open the package and eat");
		Biscuit biscuit2=new Biscuit(2,"ParleG","sweet","open the package and eat");
		Biscuit biscuit3=new Biscuit(3,"ParleG","salty","open the package and eat");
		Biscuit biscuit4=new Biscuit(4,"ParleG","sweet","open the package and eat");
		Biscuit biscuit5=new Biscuit(5,"ParleG","salty","open the package and eat");
		Biscuit biscuit6=new Biscuit(6,"ParleG","sweet","open the package and eat");
		Biscuit biscuit7=new Biscuit(7,"ParleG","salty","open the package and eat");
		Biscuit biscuit8=new Biscuit(8,"ParleG","sweet","open the package and eat");
		Biscuit biscuit9=new Biscuit(9,"ParleG","salty","open the package and eat");
		
		
		list.add(biscuit6);
		list.add(biscuit7);
		list.add(biscuit8);
		list.add(biscuit9);
		list.add(biscuit1);
		list.add(biscuit2);
		list.add(biscuit3);
		list.add(biscuit4);
		list.add(biscuit5);
		
		
		System.out.println("#########Before sorting#######");
		// retrieving all the elements.jdk 1.5
		for (Biscuit str : list) {
				System.out.println("1 = " + str);
		}
		
		//Collections.sort(list);		

		System.out.println("#########After sorting#######");
		// retrieving all the elements.jdk 1.5
		for (Biscuit str : list) {
					System.out.println("1 = " + str);
		}
		
		
		//This will override to Comparable which is default sorting
		Collections.sort(list,new SortingBiscuitByTaste());		

		System.out.println("######### sorting taste#######");
		// retrieving all the elements.jdk 1.5
		for (Biscuit str : list) {
					System.out.println("1 = " + str);
		}
	}
}
