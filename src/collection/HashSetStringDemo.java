package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//default capacity is 16
		//default load factor =.75
		Set<String> sets=new HashSet<>(16);
		sets.add("AK");
		sets.add("PK");
		sets.add("DK");
		sets.add("CK");
		//add method returns boolean
		//true if element is added otherwise false
		boolean b=sets.add("HK");
		System.out.println("xxxx = "+b);
		sets.add("AM");
		sets.add("SK");
		b=sets.add("PK");
		System.out.println("xxxx = "+b);
		
		for(String str:sets) {
			System.out.println(str);
		}
	}

}
