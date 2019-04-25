package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
/**
 * 
 * @author Nagendra
 *
 */
public class ConsumerList {
	public static void main(String[] args) {
		List<String> heros=new ArrayList<>();
		Consumer<String> consumer=heros::add;
		consumer.accept("Nagendra");
		consumer.accept("Tawin");
		consumer.accept("Yannis");
		consumer.accept("Tess");
		System.out.println(heros);
	}
}
