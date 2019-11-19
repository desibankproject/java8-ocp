package conncurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPookDemo extends RecursiveAction { // line n1
	static final int THRESHOLD_SIZE = 3;
	int stIndex, lstIndex;
	int[] data;
	 //keep static
	 static int sum; 
	public ForkJoinPookDemo(int[] data, int start, int end) {
		this.data = data;
		this.stIndex = start;
		this.lstIndex = end;
	}

	protected void compute() {
		System.out.println(Thread.currentThread());
		if ((lstIndex - stIndex) <= THRESHOLD_SIZE) {
			for (int i = stIndex; i < lstIndex; i++) {
				sum += data[i];
			}
			System.out.println(sum);
		} else {
			//System.out.println("cool!"+sum);
			/*new Sum(data, stIndex + THRESHOLD_SIZE, lstIndex).fork();
			new Sum(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute();*/
			//int middle=stIndex+(lstIndex-stIndex)/2;
			//ForkJoinPookDemo t1=new ForkJoinPookDemo(data, middle, lstIndex);
			//ForkJoinPookDemo t2=new ForkJoinPookDemo(data, stIndex, middle);
			ForkJoinPookDemo t1=new ForkJoinPookDemo(data, stIndex + THRESHOLD_SIZE, lstIndex);
			ForkJoinPookDemo t2=new ForkJoinPookDemo(data, stIndex, Math.min(lstIndex, stIndex + THRESHOLD_SIZE));
			/*t1.fork();
			t2.fork();
			t1.join();
			t2.join();*/
			invokeAll(t1, t2);
		}
	}
	
	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool ( );
		int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		fjPool.invoke (new ForkJoinPookDemo (data, 0, data.length));
		System.out.println("Sum.................");
		//System.out.println(Sum.sum);
	}
}
