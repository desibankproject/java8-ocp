package functional;

@FunctionalInterface
interface Mocha{
	public void main(int x);
}

class Reetu implements Mocha{
	@Override
	public void main(int x) {
		 System.out.println("@((@x(@(@" +x);
	}
}

public class MainAnonymous {
	public static void main(String[] args) {
		 //Creating anonymous class for Reetu
		Mocha r = x  -> System.out.println("@((@xmagic@(@" +x);
		
		r.main(122);
		
		//Hey here we are making an instance of a class which is implementing Mocha 
		//	Mocha  m =x -> System.out.println(x);
		//	m.main(3);
			Mocha  m =x -> System.out.println(x);
			m.main(3);
		
	}
}
