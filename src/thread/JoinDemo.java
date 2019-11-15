package thread;

//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class IGoAhead implements   Runnable {
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
		   System.out.println(Thread.currentThread().getName()+ " says  keep crying  "+i );	  
		}
	}
}

//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class IStopPlease implements  Runnable {
	@Override
	public void run() {
		for(int j=1;j<=1000;j++) {
		   System.out.println(Thread.currentThread().getName()+ " says  stop crying  "+j );	  
		}
	}
}


public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		//Creating task1
		IGoAhead goAhead=new IGoAhead();
		//creating
		IStopPlease stopPlease=new IStopPlease();
		//creating thread object and attaching task to it
		Thread thread1=new Thread(goAhead);
		Thread thread2=new Thread(stopPlease);
		thread1.start(); //starting thread
		thread2.start();
		
		
		for(int x=1;x<=2;x++) {
			System.out.println("Jmmmmmmmmmmmmhmmm8383838373 "+x);
		}
		
		//Main is suppose to wait to finish execution of child threads
		thread1.join();
		thread2.join();
		
		System.out.println("@)@)@)WELCOME WE HAVE DONE WITH PROCESSING , THANK YOU! ");
		System.out.println("*********************************************************");
		System.out.println("@)@)@)WELCOME WE HAVE DONE WITH PROCESSING , THANK YOU! ");
	}
}
