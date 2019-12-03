package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class FutureCall implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("Call is executing............");
		return "Hey! I have done with this!!!!!";
	}
}

public class FutureDemo {
   public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
	   ExecutorService service=Executors.newFixedThreadPool(3);
	   Future<String> result1=service.submit(new FutureCall());
	   String output=result1.get(1,TimeUnit.MINUTES);
	   System.out.println(output);
		 
   }
}
