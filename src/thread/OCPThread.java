package thread;

class GoAhead extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
		   System.out.println(Thread.currentThread().getName()+ " says  keep crying  "+i );	  
		}
	}
}
class StopPlease extends Thread {
	@Override
	public void run() {
		for(int j=1;j<=100;j++) {
		   System.out.println(Thread.currentThread().getName()+ " says  stop crying  "+j );	  
		}
	}
}


public class OCPThread {
	public static void main(String[] args) {
		GoAhead goAhead=new GoAhead();
		goAhead.start();
		StopPlease stopPlease=new StopPlease();
		stopPlease.start();
		for(int x=1;x<=100;x++) {
			System.out.println("Jmmmmmmmmmmmmhmmm8383838373 "+x);
		}
	}
}
