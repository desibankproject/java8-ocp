package collections;

import java.util.*;
 
public class HashMapDemo2 {
		
	public static void main(String[] args) {
	//Creating an instance of HashMap
	Map<String,String> maps=new HashMap<String,String>();
	
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
	
	Set<String> keys=maps.keySet();
	for(String key:keys) {
		String value=maps.get(key);
		System.out.println("Map key = "+key+" , value = "+value);
	}
	
	//making a HashMap read only
	maps=Collections.unmodifiableMap(maps);
	maps.put("1234","No!No!");
	//making a HashMap synchronized
	Collections.synchronizedMap(maps);
  }  
}	
	