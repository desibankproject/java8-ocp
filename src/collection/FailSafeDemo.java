package collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> roleNames = 
				new ConcurrentHashMap<String, String>();
		
		roleNames.put("1000", "Amit");
		roleNames.put("2000", "Rock");
		roleNames.put("3000", "Jhon");
		roleNames.put("4000", "Mike");
		
		Iterator<String> iterator = roleNames.keySet().iterator();
		while (iterator.hasNext()) {
			String roll=iterator.next();
			System.out.println(roleNames.get(roll));
			//adding another entry during accessing the elements
			roleNames.put("5000", "Rajiya");
		}
	}
}