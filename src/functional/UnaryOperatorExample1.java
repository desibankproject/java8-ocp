package functional;


import java.util.function.UnaryOperator;

/**
 * @author imssbora
 */
public class UnaryOperatorExample1 {
	public static void main(String[] args) {

		UnaryOperator<Integer> operator = t -> t * 2;

		System.out.println(operator.apply(5));
		System.out.println(operator.apply(10));
		System.out.println(operator.apply(15));
	}
}