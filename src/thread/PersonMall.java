package thread;

import java.util.Random;

public class PersonMall extends Thread {
	
	public PersonMall(String name){
		 super(name);
	}
	
	@Override
	public void run() {
		new Random().nextInt(1001);
		System.out.println("Hello I am in Mall "+super.getName());
		TrialRoom.use();
	}
	
	public static void main(String[] args) {
		PersonMall person1=new PersonMall("T1");
		PersonMall person2=new PersonMall("T2");
		PersonMall person3=new PersonMall("T3");
		PersonMall person4=new PersonMall("T4");
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		
	}
}
