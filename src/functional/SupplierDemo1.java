package functional;

import java.util.function.Supplier;

public class SupplierDemo1 {
	
	public static void main(String[] args) {
		
			Supplier<String>  sup=()  ->	"Ahahahahha";
			String sr=sup.get();
			System.out.println(sr);
	}

}
