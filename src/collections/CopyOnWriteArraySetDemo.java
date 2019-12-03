package collections;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Stream;

public class CopyOnWriteArraySetDemo {
	
	public static void main(String[] args) {
		
		 // create object of CopyOnWriteArrayList 
	    Set<Integer> arraySet   = new CopyOnWriteArraySet<Integer>(); 
	    // Add elements 
	    arraySet.add(10);
	    arraySet.add(67); 
	    arraySet.add(98); 
	    arraySet.add(100); 
	    // print CopyOnWriteArrayList 
	    System.out.println("CopyOnWriteArrayList: " + arraySet); 

	    // check using function 
	    if (arraySet.contains(100)) 
	        System.out.println("100 is present in the list"); 
	    else
	        System.out.println("100 is not present in the list"); 

	    // check using function 
	    if (arraySet.contains(20)) 
	        System.out.println("20 is present in the list"); 
	    else
	        System.out.println("20 is not present in the list"); 
	}
	
}
