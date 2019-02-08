package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsLimitation {
	
	public static void main(String[] args) {
		
		ArrayList<Number> numbers=new ArrayList<Number>();
		numbers.add(10);//Integer
		numbers.add(100);
		numbers.add(1000);
		
		//below code is pointing to new ArrayList<Number>
		numbers=new ArrayList<Number>();
		///public final class Integer extends Number implements Comparable<Integer> {
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(500);
		integers.add(600);
		integers.add(700);
		//subtyping rule is not application for generics
		//numbers=integers;
		//List<Number> packs=new ArrayList<Integer>();
		Number number=new Integer(1002); // this is fine, core java concept
	}

}
