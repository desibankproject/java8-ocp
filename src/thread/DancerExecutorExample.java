package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DancerExecutorExample {

	public static void main(String[] args) {

		Dancer dancer1=new Dancer("Jack");
		Dancer dancer2=new Dancer("Bobby");
		Dancer dancer3=new Dancer("Racker");
		Dancer dancer4=new Dancer("Jacker");
		Dancer dancer5=new Dancer("Rocker");
		
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.execute(dancer1);
		executor.execute(dancer2);
		executor.execute(dancer3);
		executor.execute(dancer4);
		executor.execute(dancer5);
		
		executor.shutdown();
		
		System.out.println("@)@(@(");
		
		
	}
	
}
