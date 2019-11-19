package gen;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure {
	public static void main(String[] args) {
		List<Number> numbers=new ArrayList<Number>();
		numbers.add(10);//Integer
		numbers.add(100.2);
		numbers.add(1000);
		
		List<String> strings=new ArrayList<String>();
		strings.add("10");//Integer
		strings.add("100");
		strings.add("1000");
		//strings.add(299);
		
		System.out.println(numbers.getClass()); //class java.util.ArrayList
		System.out.println(strings.getClass()); //class java.util.ArrayList
	}
}
