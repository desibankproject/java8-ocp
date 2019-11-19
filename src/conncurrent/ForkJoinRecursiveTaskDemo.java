package conncurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinRecursiveTaskDemo extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int start;
    private final int end;
    public static final long threshold = 10_000;

    public ForkJoinRecursiveTaskDemo(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinRecursiveTaskDemo(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {

        int length = end - start;
        if (length <= threshold) {
            return add();
        }

        ForkJoinRecursiveTaskDemo firstTask = new ForkJoinRecursiveTaskDemo(numbers, start, start + length / 2);
        ForkJoinRecursiveTaskDemo secondTask = new ForkJoinRecursiveTaskDemo(numbers, start + length / 2, end);
        
        firstTask.fork(); //start asynchronously
        //Long secondTaskResult = secondTask.compute();
      //  Long firstTaskResult = firstTask.join();
       // return firstTaskResult + secondTaskResult;
        return  secondTask.compute()+firstTask.join();
        
    //    invokeAll(firstTask,secondTask);
        //return  secondTask.join()+firstTask.join();
    }

    private long add() {
        long result = 0;
        for (int i = start; i < end; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static long startForkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinRecursiveTaskDemo(numbers);
        return new ForkJoinPool().invoke(task);
    }

    public static void main(String[] args) {

        System.out.println(ForkJoinRecursiveTaskDemo.startForkJoinSum(1_000_000));
		
    }
}
