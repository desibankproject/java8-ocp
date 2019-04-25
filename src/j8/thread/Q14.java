package j8.thread;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class Q14 {
	public static void main(String[] args) {
		
	}
		public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
			 deque.offer(103);
			 deque.offerFirst(20, 1, TimeUnit.SECONDS);
			deque.offerLast(85, 7, TimeUnit.HOURS);
			System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
			System.out.print(" "+deque.pollLast(1, TimeUnit.MINUTES));
		 }
}
