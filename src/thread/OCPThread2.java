package thread;

//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class IGoAhead implements   Runnable {
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
		   System.out.println(Thread.currentThread().getName()+ " says  keep crying  "+i );	  
		}
	}
}

//IGoAhead is thread ??? no
//IGoAhead is task ?? yes 
class IStopPlease implements  Runnable {
	@Override
	public void run() {
		for(int j=1;j<=100;j++) {
		   System.out.println(Thread.currentThread().getName()+ " says  stop crying  "+j );	  
		}
	}
}


public class OCPThread2 {
	public static void main(String[] args) {
		IGoAhead goAhead=new IGoAhead();
		IStopPlease stopPlease=new IStopPlease();
		Thread thread1=new Thread(goAhead);
		Thread thread2=new Thread(stopPlease);
		thread1.start();
		thread2.start();
		
		/*
		 * Thread thread3=new Thread(() -> { for(int j=1;j<=100;j++) {
		 * System.out.println(Thread.currentThread().getName()+
		 * " Lamda expression  stop crying  "+j ); } });
		 */
		
		for(int x=1;x<=100;x++) {
			System.out.println("Jmmmmmmmmmmmmhmmm8383838373 "+x);
		}
	}
}
