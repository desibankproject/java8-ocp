package inner.cls;

public class Snooker {
	int o=900;
	static int games=20;
	private static int result=40;
	//static class can access only static member of the outer class
	//in which it is enclosed
	static class Honda{
		private int go=30;
		static int foo=897;
		static int games=40;
		void blast(){
			//Cannot make a static reference to the non-static field o
			//System.out.println("o = "+o);
			System.out.println("games = "+games);
			System.out.println("games from outer = "+Snooker.games);
			System.out.println("result = "+result);
			System.out.println("go = "+30);
			System.out.println("foo = "+foo);
		}
	}
	public static void main(String[] args) {
			new Snooker.Honda().blast();
	}
}
