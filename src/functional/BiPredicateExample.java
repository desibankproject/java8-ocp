package functional;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<String,String> biPredicate=(t1,t2)->t1.length()>t2.length();
		boolean b=biPredicate.test("nagendra","mocha");
		System.out.println(b);
		                                                                                            //a =97 ,A =65
		BiPredicate<String,String> biPredicate2=(t1,t2)->t1.compareTo(t2)>0;
		boolean b2=biPredicate2.test("nagendra","mocha");
		System.out.println(b2);
	}
}
