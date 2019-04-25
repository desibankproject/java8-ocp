package conncurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTask {
	
	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		Future<?> future=executorService.submit(()-> System.err.println("(@(@("));
		String result="";
		try {
			 System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		if(executorService!=null){
			executorService.shutdown();
		}
		
	}

}
