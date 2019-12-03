package method.ref;

import java.util.ArrayList;
import java.util.List;

public class ListFruits {
	public static void main(String[] args) {
		List<String> fruitList=new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Mango");
		fruitList.add("Grapes");
		
		/*fruitList.forEach(t->System.out.println(t));*/
		fruitList.forEach(System.out::println);
		
	}	

}
