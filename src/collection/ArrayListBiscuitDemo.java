package collection;

import java.util.*;

/**
 * @author nagendra.yadav
 * 
 */
public class ArrayListBiscuitDemo {
	public static void main(String[] args) {
		// Generic Declaration
		// collection classes can be used as container for other objects.
		List<Biscuit> list = new ArrayList<Biscuit>(5);
		//Biscuit sbiscuit=new Biscuit(1,"ParleG","sweet","open the package and eat");
		Biscuit biscuit1=new Biscuit(1,"ParleG","sweet","open the pacaket and eat");
		Biscuit biscuit2=new Biscuit(2,"ParleG","sweet","open the pacaket and eat");
		Biscuit biscuit3=new Biscuit(3,"ParleG","salty","open the pacaket and eat");
		Biscuit biscuit4=new Biscuit(4,"ParleG","sweet","open the pacaket and eat");
		Biscuit biscuit5=new Biscuit(5,"ParleG","salty","open the pacaket and eat");
		list.add(biscuit1);
		list.add(biscuit2);
		list.add(biscuit3);
		list.add(biscuit4);
		list.add(biscuit5);
		
		
		
		// size of list
		System.out.println("############################");
		// I want to access it.
		Iterator<Biscuit> it = list.iterator();
		//Iterator can be used to access any collection which implements Collection interface
		while (it.hasNext()) {
			Biscuit element = it.next();
			//list.add("I have tested it!!");
			System.out.println("Biscuit de = " + element);
		}

		System.out.println("############################");

		// retrieving all the elements.jdk 1.5
		for (Biscuit str : list) {
			System.out.println("1 = " + str);
		}

		// retrieving all the elements.
		// fastest retrieval because access as per index of the array.
		//a[0]
		for (int i = 0; i < list.size(); i++) {
			System.out.println("2 = " + list.get(i));
		}

		ListIterator<Biscuit> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("4 = " + listIterator.next());
		}
		
		//Biscuit biscuit1=new Biscuit(1,"ParleG","sweet","open the package and eat");
				
		Biscuit sbiscuit=new Biscuit(1,"ParleG","sweet","open the package and eat");
		boolean b=list.contains(sbiscuit);
		
		if(b){
			System.out.println("Search is successful for  =  "+sbiscuit);
		}else{
			System.out.println("Sorry , " + sbiscuit+" is not in this bag.........");
		}
		
		
		
		System.out.println("#########Before sorting#######");
		// retrieving all the elements.jdk 1.5
			for (Biscuit str : list) {
					System.out.println("1 = " + str);
				}
			
		//Collections.synchronizedList(list);	
		SortingBiscuitByTaste biscuitByTaste=new SortingBiscuitByTaste();	
		Collections.sort(list,biscuitByTaste);	
		//Arrays.sort(a)//Buiscut[]
				
		System.out.println("#########After sorting#######");
		// retrieving all the elements.jdk 1.5
				for (Biscuit str : list) {
					System.out.println("1 = " + str);
				}
	}
}
