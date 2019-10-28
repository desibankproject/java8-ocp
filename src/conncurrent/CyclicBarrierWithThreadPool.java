package conncurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java program
 to demonstrate how to use CyclicBarrier in Java. CyclicBarrier is a
 * new Concurrency Utility added in Java 5 Concurrent package.
 *
 * @author Javin Paul
 */
public class CyclicBarrierWithThreadPool {

    //Runnable task for each thread
    private static class Task implements Runnable {
        private CyclicBarrier barrier;

        public Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierWithThreadPool.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierWithThreadPool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {
    	
    	ExecutorService executorService=Executors.newFixedThreadPool(3);
        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
    	 //This task will be executed once all thread reaches barrier
    	final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("All parties are arrived at barrier, lets play"));
    	executorService.submit(new Task(cb));
    	executorService.submit(new Task(cb));
    	executorService.submit(new Task(cb));
        //starting each of thread
		/*
		 * Thread t1 = new Thread(new Task(cb), "Thread 1"); Thread t2 = new Thread(new
		 * Task(cb), "Thread 2"); Thread t3 = new Thread(new Task(cb), "Thread 3");
		 * t1.start(); t2.start(); t3.start();
		 */
        
        executorService.shutdown();
     
    }
}