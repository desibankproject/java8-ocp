package conncurrent;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledAtFixExecutorRunnable2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task2 = () -> {
        													    System.out.println("Hey I am just starting at..."+LocalDateTime.now());	
        							};		
      
        System.out.println("Running task1...");
        //run this task after 5 seconds, nonblock for task3
        ScheduledFuture<?>  scheduledFuture=ses.scheduleAtFixedRate(task2, 3, 2, TimeUnit.SECONDS);
        System.out.println("Running task3...");
        Object on=scheduledFuture.get();
        System.out.println(on);
        ses.shutdown();
    }


}
