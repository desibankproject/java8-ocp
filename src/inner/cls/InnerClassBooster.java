package inner.cls;

public class InnerClassBooster {
	
	private int b=100;
	private static int c=200;
	private final int g=876;
	
	InnerClassBooster(){
		//g=100;
	}
	
	public void showBoost(){
		System.out.println("b = "+b);
		System.out.println("static c = "+c);
	}
	
	//non-static inner type
	public class Jocker{
		int i=900;
		final int m=400;
		//static int poo=2*3;
		int b=909090;
		//The field opo cannot be declared static in a non-static inner type, 
		//unless initialized with a constant expression
		//static int opo=700;
		public void foo(){
			System.out.println("---inside foo---");
			System.out.println("b = "+b);
			System.out.println("Booster.this.b = "+InnerClassBooster.this.b);
			System.out.println("c = "+c);
			System.out.println("g ="+g);
			System.out.println("i ="+i);
			System.out.println("m ="+m);
		}
	}
	public static void main(String[] args) {
		//creating an instance of inner class 
		InnerClassBooster icb=new InnerClassBooster();
		//InnerClassBooster.Jocker jocker=new InnerClassBooster().new Jocker();
		InnerClassBooster.Jocker jocker=icb.new Jocker();
		jocker.foo();
	}
	
}
