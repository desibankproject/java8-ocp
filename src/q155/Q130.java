package q155;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Q130 {
	public static void main(String[] args) {
		IntStream stream = IntStream.of (1,2,3);
//		IntFunction<Integer> inFu= x -> y -> x*y;//line n1
		IntFunction<IntUnaryOperator> inFu = x -> y -> x*y; 
		IntStream newStream = stream.map(inFu.apply(10));//line n2
		//IntStream newStream = stream.map(inFu.applyAsInt (10)); 
		newStream.forEach(System.out::print);
	}
}
