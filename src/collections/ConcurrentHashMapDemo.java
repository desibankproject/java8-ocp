package collections;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
	
	public static void main(String[] args) {
		
		//Creating an instance of HashMap
		Map<String,String> maps=new ConcurrentHashMap<String,String>();
		//here same rules of set will be applicable for key
		//like = key cannot be duplicate
		 //=>> key can be null
		 //=>>>>>>>key class must override hashcode and equals method
		maps.put("122", "Ankita");
		maps.put("133", "Jobs");
		maps.put("144", "Mike");
		maps.put("155", "Michal");
		//returns old value since 155 key is already in HashMap
		String old=maps.put("155", "GPS");
		System.out.println("old = "+old);
		//Accessing HashMap
		Set<Map.Entry<String,String>> entries=maps.entrySet();
		for(Map.Entry<String,String> entry:entries){
			System.out.println("___________________________");
			System.out.println("Key = "+entry.getKey());
			System.out.println("Value = "+entry.getValue());
		}
		//making a HashMap read only
		maps=Collections.unmodifiableMap(maps);
		maps.put("1234","No!No!");
		//making a HashMap synchronized
		Collections.synchronizedMap(maps);
	}

}
