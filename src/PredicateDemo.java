import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Chi");
		fruits.add("Pea");
		/*Predicate<String> p=new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length()>3;
			}
		};*/
		//Predicate<String> p=t->t.length()>3;
		print(fruits,t->t.length()>3);
	}
	
	public static void print(List<String> fruits,Predicate<String> p) {
		for(String faa:fruits) {
			 if(p.test(faa)) {
				 System.out.println(faa);
			 }
		}
		
	}

}
