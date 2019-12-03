package j8.exception;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallTask implements Callable<Integer>{
	
	private String tname;
	
	CallTask(String tname) {
		this.tname=tname;
	}
	
	@Override
	public Integer call() {
			for(int x=1;x<=100;x++) {
		  		System.out.println(tname+"  -   Hey I am happy ! x = "+x);
			}
			 Random rand = new Random(); 
		        // Generate random integers in range 0 to 99 
		       int rand_int1 = rand.nextInt(100); 
		       System.out.println("rand_int num  is   = "+rand_int1);
		       return rand_int1;
	}
}

public class CallableWithThreadPool {
	public static void main(String[] args) {
		 ExecutorService executor=Executors.newSingleThreadExecutor();
		 //Future is interface which will hold result coming from Callable task
		 Future<Integer> future1= executor.submit(new CallTask("T1"));
		 Future<Integer> future2= executor.submit(new CallTask("T2"));
		 Future<Integer> future3= executor.submit(new CallTask("T3"));
		 Future<Integer> future4=executor.submit(new CallTask("T4"));
		 Future<Integer> future5=executor.submit(new CallTask("T5"));
			int total;
			try {
				total = future1.get()+future2.get()+future3.get()+future4.get()+future5.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(total);
		 if(executor!=null) {
			 executor.shutdown();
		 }
		
	}
}
