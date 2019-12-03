package thread;

public class Dancer implements Runnable {

	private String name;
	
	public Dancer(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int x=1;x<=1000;x++) {
			System.out.println("Hello My name is "+this.name+" and I am disco dancer!!!");
		}
		
	}
}
