package conncurrent;

import java.util.concurrent.atomic.AtomicInteger;

class Zee {
	static int count=100;
		
}

class ZeeZee {
	static AtomicInteger count=new AtomicInteger(100);
		
}

class Runner  implements Runnable {
       private String tname;
	   public Runner (String name){
	       this.tname=name;
	   }

	   public void run() {
	             for(int x=0;x<10000;x++) {
	                    System.out.println("calling thread = "+tname);
	                   ZeeZee.count.getAndIncrement();
	            }
	   }
	} 