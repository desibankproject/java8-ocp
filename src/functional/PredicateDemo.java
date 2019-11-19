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
		
		String s="Nagendra";
	/*	Predicate<Jango>  pred=new Predicate<Jango>() {
			@Override
			public boolean test(Jango t) {
				return t.check(s);
			}
		};*/
		
		/*Predicate<Jango>  pred=(Jango t) -> {
				return t.check(s);
			};*/
		
	/*	Predicate<Jango>  pred=(Jango t) -> t.check(s);*/
		
		/*Predicate<Jango>  pred=(t) ->t.check(s);*/
		
		Predicate<Jango>  pred=t ->t.check(s);
		boolean b=pred.test(new Jango());
		
		Predicate<Jango>  preda=(Jango t) ->t.check("Nagendra");
		boolean c=preda.test(new Jango());
		System.out.println(c);
	}
}
