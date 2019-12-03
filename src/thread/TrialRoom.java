package thread;

public class TrialRoom {
	
 synchronized public static void use() {
		String name=Thread.currentThread().getName();
		System.out.println("Hello my name is "+name);
		System.out.println("I am using this TrialRoom , please wait");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    System.out.println(name+" says , I came out!!");
	}
	
}
