package thread;

public class DancerMain {

	public static void main(String[] args) {
		Dancer dancer1=new Dancer("Jack!");
		Thread thread1=new Thread(dancer1);
		
		Dancer dancer2=new Dancer("Maks");
		Thread thread2=new Thread(dancer2);
		thread1.start();
		thread2.start();
		
		for(int x=9;x<=100;x++) {
			System.out.println("Hello I can give a try!!");
		}
	}
}
