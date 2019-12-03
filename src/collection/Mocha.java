package collection;

public class Mocha {
	
	int x=100;
	static int t=00;

	class Kid {
		int x=88;
		//static int age=9; //inner class cannot have static variable since we cannot load it
		public void foo() {
			System.out.println("x = "+Mocha.this.x);
			System.out.println("x = "+x);
			System.out.println("t = "+Mocha.t);
			System.out.println("t = "+t);
		}
		
	}
	
	public static void main(String[] args) {
		Mocha.Kid kid= new Mocha().new Kid();
		kid.foo();
	}
	
}
