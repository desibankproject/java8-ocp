import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Chi");
		fruits.add("Pea");
		//Consumer<String> t=(p)->System.out.println(p);	
		print(fruits,System.out::println);
	}
	
	private static void print(List<String> fruits,Consumer<String> t) {
		for(String paa:fruits) {
			t.accept(paa);
		}
	}
}
