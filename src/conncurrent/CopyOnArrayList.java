package conncurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class CopyOnArrayList {

	public static void main(String[] args) {
		//List<String> data=new ArrayList<String>();
		List<String> data=new CopyOnWriteArrayList<String>();
		data.add("A");
		data.add("B");
		data.add("C");
		data.add("D");
		System.out.println("Size = "+data.size());
		for(String str:data) {
			System.out.println("str = "+str);
			data.add("OWO");
		}
		System.out.println("Size = "+data.size());
	}
	
}
