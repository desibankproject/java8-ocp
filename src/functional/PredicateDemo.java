package functional;

import java.util.function.Predicate;

class Jango {
	
	 public boolean check(String  s) {
		 	return s.contains("a");
	 }
	   
	   public void show() {
		   System.out.println("Hello 919282828 ");
	   }
}


public class PredicateDemo {

	//public boolean test(Jango t)
	public static void main(String[] args) {
		Predicate<Jango>  preda=(Jango t) ->t.check("Nagendra");
		boolean b=preda.test(new Jango());
		System.out.println(b);
	}
}
