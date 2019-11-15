package method.ref;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<List<String>> consumer1=Collections::sort;
	}
}
