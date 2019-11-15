package thread;

public class MainThreadDemo {
	
	public static void main(String[] args) {
		System.out.println("Hey this method is called by main thread!!!!");
		//here t will hold reference of thread who calls main method
		Thread t=Thread.currentThread();
		System.out.println("Thread id = "+t.getId());
		System.out.println("Thread Name  = "+t.getName());
		System.out.println("Thread State  = "+t.getState());
		//System.out.println(this);
		
	}

}
