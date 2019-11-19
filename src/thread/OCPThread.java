package thread;

class GoAhead extends Thread {
	
	public GoAhead(String cname) {
		super(cname);
	}
	@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
		   System.out.println(Thread.currentThread().getName()+ " says  keep crying  "+i );	  
		}
	}
}
class StopPlease extends Thread {
	public StopPlease(String cname) {
		super(cname);
	}
	@Override
	public void run() {
		for(int j=1;j<=1000;j++) {
		   System.out.println(Thread.currentThread().getName()+ " says  stop crying  "+j );	  
		}
	}
}


public class OCPThread {
	public static void main(String[] args) {
		GoAhead goAhead=new GoAhead("Jocker");
		goAhead.start();
		StopPlease stopPlease=new StopPlease("Maks");
		stopPlease.start();
		for(int x=1;x<=1000;x++) {
			System.out.println("Jmmmmmmmmmmmmhmmm8383838373 "+x);
		}
	}
}
