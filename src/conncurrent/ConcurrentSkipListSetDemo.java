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
		int x=0;
		for(String s:concurrentSkipListSet) {
			System.out.println(s);
			concurrentSkipListSet.add(s+x);
		}
		System.out.println(concurrentSkipListSet);
	}
}
