package functional;

import java.util.function.Supplier;

public class SupplierDemo1 {
	
	public static void main(String[] args) {
		
		    /*Supplier<String> s=new Supplier<String>() {
		    	@Override
		    	public String get() {
		    		return "OWOW";
		    	}
			};*/
			/*Supplier<String> s=() -> {
	    		return "OWOW";
	    	};*/
	    	
			Supplier<String> s=() -> "OWOW";
			String hmmmm=s.get();
		
			Supplier<String>  sup=() ->"Ahahahahha";
			String sr=sup.get();
			System.out.println(sr);
	}

}
