package thread;

class Jocker extends Thread {
	
	public Jocker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int x = 1; x <= 10; x++) {
					Mocha.zee();
		}
	}
}

class Pocker extends Thread {
	public Pocker(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for (int x = 1; x <= 10; x++) {
					Mocha.zee();
		}
	}
}

public class AsynchThreads {
	public static void main(String[] args) {
			new Jocker("Jocker").start();
			new Pocker("Pocker").start();
	}
}
