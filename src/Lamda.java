
public class Lamda {
		public static void main(String... main){
			Runnable task= ()->System.out.println("333");
			executeTask(()->System.out.println("333"));
		}
		
		public static void executeTask(Runnable r) {
			
		}
	
}
