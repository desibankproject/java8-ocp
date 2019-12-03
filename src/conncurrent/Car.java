package conncurrent;

import java.time.LocalDateTime;

public class Car {

	//Method level synchronization
	/*synchronized public static void driving(String name) throws InterruptedException {
		   String cthread=Thread.currentThread().getName();
		   System.out.println("cthread  = "+cthread +" , driver name "+name+" at "+LocalDateTime.now());
		   Thread.sleep(2000);
		   System.out.println("Hey car is free now!!!");
	}*/
	
	//block  level synchronization
	 public static void driving(String name) throws InterruptedException {
		 synchronized (Car.class) {
			   String cthread=Thread.currentThread().getName();
			   System.out.println("cthread  = "+cthread +" , driver name "+name+" at "+LocalDateTime.now());
			   Thread.sleep(2000);
			   System.out.println("Hey car is free now!!!");
		}
	}
	
}
