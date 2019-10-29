package collection;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	/**
	 * @param args
	 */
	
	//every method is called by a thread.
	//memory for all the variable inside main method allocated on java stack ,
	//which is inside main thread.
	// who creates main thread?? JVM
	//every thread has unique thread id and name
	//main thread name is ="main thread";
	//can we change the name of the thread ? yes
	//
	public static void main(String[] args) {
		
		Biscuit biscuit1=new Biscuit(1,"ParleG","sweet","open the package and eat");
		Biscuit biscuit2=new Biscuit(2,"ParleG","sweet","open the package and eat");
		Biscuit biscuit3=new Biscuit(3,"ParleG","salty","open the package and eat");
		Biscuit biscuit4=new Biscuit(4,"ParleG","sweet","open the package and eat");
		Biscuit biscuit5=new Biscuit(5,"ParleG","salty","open the package and eat");
		Biscuit biscuit6=new Biscuit(6,"ParleG","sweet","open the package and eat");
		
		WeakHashMap<Biscuit,String> whm=new WeakHashMap<Biscuit,String>();
		whm.put(biscuit1, "1000");
		whm.put(biscuit2, "2000");
		whm.put(biscuit3, "3000");
		whm.put(biscuit4, "4000");
		whm.put(biscuit5, "5000");
		whm.put(biscuit6, "6000");
		System.out.println("Size of map is  = "+whm.size());
		
		biscuit1=biscuit6;
		biscuit2=null;
		//Call GC
		System.gc();
		Runtime.getRuntime().gc();
		
		System.out.println("Sorry !  main is sleep right now for 5 seconds!!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//ntime.getRuntime().gc();
		System.out.println("Size of map  after GC is  = "+whm.size());
		
		
		
	}

}
