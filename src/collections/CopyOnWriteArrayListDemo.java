package collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		 // create object of CopyOnWriteArrayList 
	    List<Integer> arrayList   = new CopyOnWriteArrayList<Integer>(); 
	    // Add elements 
	    arrayList.add(10);
	    arrayList.add(67); 
	    arrayList.add(98); 
	    arrayList.add(100); 
	    // print CopyOnWriteArrayList 
	    System.out.println("CopyOnWriteArrayList: " + arrayList); 

	    // check using function 
	    if (arrayList.contains(100)) 
	        System.out.println("100 is present in the list"); 
	    else
	        System.out.println("100 is not present in the list"); 

	    // check using function 
	    if (arrayList.contains(20)) 
	        System.out.println("20 is present in the list"); 
	    else
	        System.out.println("20 is not present in the list"); 
	}
	
}
