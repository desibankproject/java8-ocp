package functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
			UnaryOperator<String>  tt =(String t) -> {
					System.out.println("@(@(@*(@*@");
					System.out.println("@(@(@*(@*@");
					System.out.println("@(@(@*(@*@");
					System.out.println("@(@(@*(@*@");
					return "Mr " +t;
				};
				
				String toe=tt.apply("Nagendra");
				
	}
	
}
