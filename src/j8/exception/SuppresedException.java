package j8.exception;

class Pocker implements AutoCloseable {
	@Override
	public void close()  {
		System.out.println("Hey ! Pocker is closed!");
		throw new IllegalArgumentException("Hmmm Mr. Pocker");
	}
}

class Mover implements AutoCloseable {
	@Override
	public void close() {
		System.out.println("Hey ! Mover is closed!");
		throw new ArithmeticException("Hmmm Mr. Mover");
	}
}

class MockException extends RuntimeException{
	MockException(String msg){
	   super(msg);	
	}
}

public class SuppresedException {
	public static void main(String[] args) {
		  try(Pocker p=new Pocker();Mover mover=new Mover()){
			  System.out.println("Executing try block!");
		  }catch (IllegalArgumentException e) {
			           System.out.println("Printing primary message");
                       System.out.println("####"+e.getMessage());
		              for(Throwable r:e.getSuppressed()) {
		            	      System.out.println("suppressed! one = "+r.getMessage());
		              }
		  }
	}
}
