package functional;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	public static void main(String[] args) {
/*		  BinaryOperator<String> binaryOperator=new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
*/	
		/*BinaryOperator<String> binaryOperator = (String t1,String t2) -> {
			 return t1+t2;
		};*/
		
		BinaryOperator<String> binaryOperator = (t1,t2) ->t1+t2;
		String result=binaryOperator.apply("Mr", "Nagendra");
		System.out.println(result);
	}
}
