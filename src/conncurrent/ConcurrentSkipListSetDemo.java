package conncurrent;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {

	public static void main(String[] args) {
		ConcurrentSkipListSet<String> concurrentSkipListSet=new ConcurrentSkipListSet<String>();
		concurrentSkipListSet.add("A");
		concurrentSkipListSet.add("D");
		concurrentSkipListSet.add("M");
		concurrentSkipListSet.add("C");
		concurrentSkipListSet.add("B");
		System.out.println(concurrentSkipListSet);
		
		for(String s:concurrentSkipListSet) {
			concurrentSkipListSet.add(s);
		}
		System.out.println(concurrentSkipListSet);
		
	}
}
