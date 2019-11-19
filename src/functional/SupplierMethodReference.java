package functional;

import java.util.function.Supplier;

public class SupplierMethodReference {
	
	public static void main(String[] args) {
		//Supplier<String>  supplier=()->new String();
		Supplier<String>  supplier=String::new;
		
	}

}
