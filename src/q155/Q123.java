package q155;

class MyException extends RuntimeException{
}
public class Q123 {
	public static void main(String[] args) {
		try {
			method1();
		}catch (MyException e) {
			System.out.println("A");
		}
	}
	
	public static void method1() { // line n1
		try {
			throw Math.random()> .5 ? new MyException() : new RuntimeException();
		}catch (RuntimeException e) {
			System.out.println("B");
		}
		
	}
}
