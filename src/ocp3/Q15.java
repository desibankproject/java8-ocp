package ocp3;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Q15 {
	public static void main(String[] args) {
		//Calling parallel() on an already parallel is allowed, and
		//it may in fact return the same object
		//   <U> U reduce(U identity,
        // BiFunction<U, ? super T, U> accumulator,
        // BinaryOperator<U> combiner);
		/*System.out.println(Arrays.asList("duck","chicken","flamingo","pelican")
				.parallelStream().parallel()// q1
				.reduce(0,
				(c1,c2) -> c1.length() +c2.length(), // q2
				(s1,s2) -> s1 + s2)); // q3
*/	}
}
