package inner.cls;

public class StaticInnerSnooker {
	int o=900;
	static int games=20;
	private static int result=40;
	//static class can access only static member of the outer class
	//in which it is enclosed
	String str;
	
	static class Honda{ //nested class
		int o=800;
		private int go=30;
		static int foo=897;
		static int games=40;
		final int m=400;
		void blast(){
			//Cannot make a static reference to the non-static field o
			//System.out.println("o = "+o);
			//System.out.println(StaticInnerSnooker.this.o);
			System.out.println("games = "+games);
			System.out.println("games from outer = "+StaticInnerSnooker.games);
			System.out.println("result = "+result);
			System.out.println("go = "+30);
			System.out.println("foo = "+foo);
		}
	}
	public static void main(String[] args) {
		StaticInnerSnooker.Honda ho=new StaticInnerSnooker.Honda();
		ho.blast();
	}
}
