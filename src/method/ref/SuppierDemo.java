package method.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SuppierDemo {

	public static void main(String[] args) {
		
		Supplier<String> strsup=String::new;

		Supplier<List<String>> list=ArrayList::new;
		list.get();
	}
	
}
