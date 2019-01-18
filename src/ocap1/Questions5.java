package ocap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Questions5 {
	public static void main(String[] args) {
		List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
		//CopyOnWriteArraySet<E>
		List<Integer> �sh = new CopyOnWriteArrayList<>(source);
		List<Integer> mammals =Collections.synchronizedList(source);
		Set<Integer> birds = new ConcurrentSkipListSet<>();
		birds.addAll(source);
		synchronized(new Integer(10)) {
		for(Integer f: �sh) 
			�sh.add(4); // c1
			for(Integer m: mammals) 
				mammals.add(4); // c2
		for(Integer b: birds) birds.add(5); // c3
		System.out.println(�sh.size()+" "+mammals.size()+" "+birds.size());
		}

	}
}
