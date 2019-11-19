import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo3 {
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Chi");
		fruits.add("Pea");
		//fruits.forEach(t->System.out.println(t));
		fruits.forEach(System.out::println);
	}
	
}
