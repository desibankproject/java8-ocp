package thread;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
	
	@Override
	public void run(){
		System.out.println("This is really! magic!"+LocalDateTime.now());
	}
	
}

public class RepeatFixRateScheduledTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	     ScheduledExecutorService executorService=Executors.newScheduledThreadPool(3);
	     System.out.println("@)@)@)@)@)Executing.............");
	     executorService.scheduleAtFixedRate(new Task(),2, 5, TimeUnit.SECONDS);
	     System.out.println("@)@)@)@)@)Executing DONE.............");
	     System.out.println("@)@)@)@)@)Executing DONE.............");
	}
	
}
