package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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

 
public class TreeMapDemo {
		
  public static void main(String[] args) {
	TreeMap<String,String> maps=new TreeMap<String,String>();
	 //key must override hashCode and equals method
	maps.put("Apple", "Sweet");
	maps.put("Mango", "Sweet");
	maps.put("Grapes", "Sour");
	maps.put("Banana", "NotK");
	maps.put("Orange", "Sour");
	maps.put("Papaya", "Lemon");
	//Accessing TreeSet
	Set<Map.Entry<String,String>> entries=maps.entrySet();
	System.out.println("output =");
	for(Map.Entry<String,String> entry:entries){
		System.out.print("Key = "+entry.getKey());
		System.out.println(",Value = "+entry.getValue());
	}
  }  
}	
	