package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ReduceExampleDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		    List<String> heros=new ArrayList<>();
			heros.add("Nagendra");
			heros.add("Tawin");
			heros.add("Yannis");
			heros.add("Tess");
			Stream<String> stream=heros.stream();
			String result=stream.reduce("RT",(first,second)->first+second);
			System.out.println(result);
			
			ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
			service.scheduleWithFixedDelay(() -> { // w1
			System.out.println("Open Zoo");
			//return null; // w2
			}, 0, 1, TimeUnit.MINUTES);
			Future<?> presult = service.submit(() -> System.out.println("Wake Staff")); // w3
			System.out.println(presult.get()); // w4
	}
}
