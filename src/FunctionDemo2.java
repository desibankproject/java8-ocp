import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo2 {
	
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Chi");
		fruits.add("Pea");
		System.out.println(fruits);
		printLen(fruits,(s)-> s.length());
		printLen(fruits,String::length);
		fruits.removeIf(t->t.length()>3);
		System.out.println(fruits);
	
	}
	
	public static void printLen(List<String> fruits,Function<String,Integer> m) {
            for(String paa:fruits) {
            	m.apply(paa);	
            }
			
	}

}
