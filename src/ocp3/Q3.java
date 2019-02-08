package ocp3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Q3 {
	
	public static void main(String[] args) {
		ScheduledExecutorService service =Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(()->{ // w1
		System.out.println("OpenZoo");
		//return null; // w2
		},0, 1, TimeUnit.MINUTES);
		Future<?>result =service.submit(() -> System.out.println("Wake Staff"));// w3
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}//w4
	}

}
