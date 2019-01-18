package inner.cls;

public class Booster {
	private int b=100;
	private static int c=200;
	private final int g=876;
	public void showBoost(){
		System.out.println("b = "+b);
		System.out.println("static c = "+c);
	}
	//non-static inner type
	public class Jocker{
		int i=900;
		final int m=400;
		int b=909090;
		//The field opo cannot be declared static in a non-static inner type, 
		//unless initialized with a constant expression
		//static int opo=700;
		public void foo(){
			System.out.println("---inside foo---");
			System.out.println("b = "+b);
			System.out.println("Booster.this.b = "+Booster.this.b);
			System.out.println("c = "+c);
			System.out.println("g ="+g);
			System.out.println("i ="+i);
			System.out.println("m ="+m);
		}
	}
	public static void main(String[] args) {
		//creating an instance of inner class 
		Booster.Jocker jocker=new Booster().new Jocker();
		jocker.foo();
	}
	
}
