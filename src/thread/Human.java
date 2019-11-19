package thread;

public class Human extends Thread {
	public Human(String name) {
		  super(name);
	}
	
	@Override
	public void run() {
          System.out.println(Thread.currentThread().getName()+" is going to use trial room");
          TrialRoom.tryMe();
	}
	
}
