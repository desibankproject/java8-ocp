package method.ref;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<String> str=String::new;
		
	/*	Supplier<String> str2=new Supplier<String>() {
			@Override
			public String get() {
				return new String();
			}
		};*/
		
	}

}
