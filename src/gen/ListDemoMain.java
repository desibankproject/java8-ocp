package gen;

import java.util.ArrayList;
import java.util.List;

public class ListDemoMain {

	public static void main(String[] args) {
		List<String>  list=new ArrayList<String>();
		list.add("Nagendra");
		//list.add(122); //Generics allows type safety
		for(String t : list){ //Generics avoids unnecessarily type casting
			
		}
	}
	
}
