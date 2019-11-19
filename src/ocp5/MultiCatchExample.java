package ocp5;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			 int x=100/0;
			 System.out.println(x);
		} catch (ArithmeticException e) {

		} catch (Exception e) {
			
		}

	}
}
