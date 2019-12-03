package conncurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CarDriver  implements Runnable {
	private  String driver;
	public CarDriver(String driver) {
		this.driver=driver;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Starting run method");
			Car.driving(driver);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		executorService.submit(new CarDriver("Jack"));
		executorService.submit(new CarDriver("Maks"));
		executorService.submit(new CarDriver("Tax"));
		executorService.shutdown();
	}

}
