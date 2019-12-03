package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		Set<Integer> integers=new TreeSet<Integer>(); //0
		integers.add(10);
		integers.add(10);
		integers.add(20);
		//integers.add(null);//We cannot assign null value
		integers.add(30);
		integers.add(40);
		integers.add(50);
		for(Integer x :integers) {
			 System.out.println(x);
		}
 	}
}
