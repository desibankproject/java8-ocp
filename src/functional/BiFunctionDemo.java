package functional;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer,Float, String>  biFunction=(t,u)->  t+u+"";
		 foo((t,u)->  t+u+"");
 	}
	static void foo(BiFunction<Integer,Float, String>  biFunction) {
		
	}
}
