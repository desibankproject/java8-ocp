package gen;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List opa=new ArrayList(); //Object type
		opa.add("Nagendra");
		opa.add(122);
		opa.add(12.3);
		
		for(Object object:opa) {
				String sr=(String)object;
		}	
	}
	
}
