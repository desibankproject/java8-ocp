package collection;

public class LocalInnerClass {
	private int length = 5;
	private static  int anything;

	public void calculate(int x) {
		final int width = 20;
		 int max=100;
		//x++;
		//max=1002;
		//local inner class can access only either final or effective final from the method in which it is defined.
		class Inner {
			public void multiply() {
				System.out.println(length * width);
				System.out.println("x = "+x);
				System.out.println("@()@(@(@max = "+max);
				System.out.println(LocalInnerClass.anything);
				System.out.println(LocalInnerClass.this.length);
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}

	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.calculate(12);
	}
}