package q155;

import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q121 {
	public static void main(String[] args) {
		int x=190;
		double d=x;
		float g=2;
		d=g;
		
		DriverManager.getDriver(url);		
		List<Integer> codes = Arrays.asList (10, 20);
		UnaryOperator<Double> uo = s -> s +10.0;
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
	}
}
