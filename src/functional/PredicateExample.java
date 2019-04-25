package functional;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<String> p1=String::isEmpty;
		Predicate<String> p2=x->x.isEmpty();
		System.out.println(p1.test(""));
		System.out.println(p2.test("Amogh"));
	}
}
