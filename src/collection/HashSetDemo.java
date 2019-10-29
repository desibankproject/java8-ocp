package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

 
public class HashSetDemo {
		
	public static void main(String[] args) {
	
		Dog dog1 = new Dog("bulldog", "black", 3000);
		Dog dog2 = new Dog("tommy", "white", 300);
		Dog dog3 = new Dog("joby", "yellow", 33);
		Dog dog4 = new Dog("jhony", "green", 444);
		Dog dog5 = new Dog("jabber", "orange", 555);
		Dog dog6 = new Dog("bulldog", "black", 3000);

		// default capacity 16
		Map<Dog,String> dogsBucket = new HashMap<Dog,String>();
		dogsBucket.put(dog1,"OUETE");
		dogsBucket.put(dog2,"MAKA");
		dogsBucket.put(dog3,"TODO");
		dogsBucket.put(dog4,"HAMANY");
		dogsBucket.put(dog5,"KETO");
		dogsBucket.put(dog6,"ROBO");
		String value=dogsBucket.put(dog6,"JADU");
		
		System.out.println("Value = "+value);
		Set<Map.Entry<Dog,String>> entries=dogsBucket.entrySet();
		for(Map.Entry<Dog,String> entry:entries){
			System.out.println("Key = "+entry.getKey());
			System.out.println("value = "+entry.getValue());
		}
		
}  
}	
	