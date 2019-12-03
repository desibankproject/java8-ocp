package conncurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class Task implements Runnable{
	private String tname;
	Task(String tname) {
		this.tname=tname;
	}
	@Override
	public void run() {
			for(int x=1;x<=100;x++) {
		  		System.out.println(tname+"  -   Hey I am happy ! x = "+x);
			}
	}
}

public class RunnableWithThreadPool {
	public static void main(String[] args) {
		  Executor executor=Executors.newFixedThreadPool(5);
		  executor.execute(new Task("T1"));
		  executor.execute(new Task("T2"));
		  executor.execute(new Task("T3"));
		  executor.execute(new Task("T4"));
		  executor.execute(new Task("T5"));
		  executor.execute(new Task("T6"));
		  executor.execute(new Task("T7"));
	}
}
