package ocap1;

import java.util.concurrent.*;

import java.util.stream.*;

public class BabyPandaBathManager {

	public static void await(CyclicBarrier cb) {
		try {
			  System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
			cb.await();
		    System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}

	public static void main(String[] args) {

		final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.
				println("Clean!"));// u1
		ExecutorService service = Executors.newScheduledThreadPool(3);
		IntStream.iterate(1, i -> 1) // u2
				.limit(12)
				.forEach(i -> service.submit( // u3

						() -> await(cb))); // u4

		service.shutdown();

	}

}