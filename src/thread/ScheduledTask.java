package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class Owo implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		return "This is really! magic!";
	}
	
}

public class ScheduledTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	     ScheduledExecutorService executorService=Executors.newScheduledThreadPool(3);
	     System.out.println("@)@)@)@)@)Executing.............");
	     ScheduledFuture<String> future=executorService.schedule(new Owo(), 5, TimeUnit.SECONDS);
	     System.out.println(future.get());
	     System.out.println("@)@)@)@)@)Executing DONE.............");
	     System.out.println("@)@)@)@)@)Executing DONE.............");
	}
	
}
