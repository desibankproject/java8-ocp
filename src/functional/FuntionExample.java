package functional;

import java.util.function.Function;

public class FuntionExample {
	public static void main(String[] args) {
		Function<String,Integer> f1=String::length;
		Function<String,Integer> f2=(s)->s.length();
		System.out.println(f1.apply("Omega"));
		System.out.println(f2.apply("Omega"));
	}
}
