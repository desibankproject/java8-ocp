package collection;

import java.util.Hashtable;



/**
 * @author nagendra.yadav
 *    Contract for Set!
 *    
 *   1. it does not allow duplicate elements
 *   2. it uses hashCode
 *   3. It is good for searching and Adding,remove , size the element
 *      O(1) =constant time()
 *   4. This is not ordered!   
 *    *        
 *  TreeSet = log(n)
 */

 
public class HashTableDemo {
		
	public static void main(String[] args) {
		
	//synchronized
	//capacity ==11
	//does not allow null as a key and value	
	Hashtable maps=new Hashtable();
	//here same rules of set will be applicable for key
	//like = key cannot be dulplicate
	//    =>> key can be null
	 //=>>>>>>>key must overridden hashcode and equals method
	maps.put("122", "Nagendra");
	maps.put("133", "Swapnil");
	maps.put("144", "Ashish");
	maps.put("155", "Jeff");
	String old=(String)maps.put("155", "Tridib");
	System.out.println("old = "+old);
	
	
}  
}	
	