package collection;

import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		//default capacity is 0
		Set<String> sets=new TreeSet<>();
		sets.add("AK");
		sets.add("PK");
		sets.add("DK");
		sets.add("CK");
		//add method returns boolean value
		//true if element is added otherwise false
		boolean b=sets.add("HK");
		System.out.println("xxxx = "+b);
		sets.add("AM");
		sets.add("SK");
		for(String str:sets) {
			System.out.println(str);
		}	
  }
}
