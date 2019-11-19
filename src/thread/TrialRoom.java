package thread;


//for static synchronized method lock will be checked for Class
public class TrialRoom {

	/**
	synchronized static public void tryMe() {
		System.out.println(Thread.currentThread().getName() + "  is here");
		System.out.println(Thread.currentThread().getName() + "  using trial room");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"  Says Please wait");
	}*/
	
	 static public void tryMe() {
		 //synchronized block
	    synchronized (TrialRoom.class) {
				   	 System.out.println(Thread.currentThread().getName() + "  is here");
						System.out.println(Thread.currentThread().getName() + "  using trial room");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"  Says Please wait");
		}
	}
}
