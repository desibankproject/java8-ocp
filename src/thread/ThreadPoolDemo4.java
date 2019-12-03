package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class EMagic implements Runnable{
	private String name;
	EMagic(String name){
		this.name=name;
	}
	@Override
	public void run() {
			for(int x=1;x<=1000;x++) {
				System.out.println("Task name " +name+ " Magic  - x "+x); 
			}
	}
}

public class ThreadPoolDemo4 {
	public static void main(String[] args) throws InterruptedException {
		       ExecutorService exe=  Executors.newFixedThreadPool(3);
		       exe.execute(new EMagic("Task1"));
		       exe.execute(new EMagic("Task2"));
		       exe.execute(new EMagic("Task3"));
		       exe.execute(new EMagic("Task4"));
		       exe.execute(new EMagic("Task5"));
		       exe.execute(new EMagic("Task6"));
		       exe.shutdown();
		      // exe.awaitTermination(2,TimeUnit.MINUTES);
		       System.out.println("@@)this is welcome and we have finished all the tasks!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
