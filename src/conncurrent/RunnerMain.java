package conncurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnerMain {

	public static void main(String[] args) throws InterruptedException {
		Runner runner1=new Runner("A");
		Runner runner2=new Runner("B");
		Runner runner3=new Runner("C");
		Runner runner4=new Runner("D");
		ExecutorService executorService=Executors.newFixedThreadPool(4);
		executorService.submit(runner1);
		executorService.submit(runner2);
		executorService.submit(runner3);
		executorService.submit(runner4);
		executorService.shutdown();
		System.out.println("Printing value once all the task are completed");
		executorService.awaitTermination(2,TimeUnit.MINUTES);
		System.out.println("ZeeZee.count  - "+ZeeZee.count);
	}
}
