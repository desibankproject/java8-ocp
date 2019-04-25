package inner.cls;

public class LamdaExpression {
	int m=100;
	static int z=100;
	public static void main(String[] args) {
		int x=100; //effective final
	/*	Runnable trun=new Runnable() {
			@Override
			public void run() {
				System.out.println(x);
				//System.err.println(m);
				System.err.println(z);
			}
		};*/
		/*Runnable trun=()->{
			System.out.println(x);
		};*/
		
		Runnable trun=()->System.out.println(x);
		
		new Thread(trun).start();
	}

}
