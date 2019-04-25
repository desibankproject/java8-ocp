package j8.exception;

public class Jocker implements AutoCloseable {

	String name;
	public Jocker(String name){
		this.name=name;
	}
	
	@Override
	public void close() {
		System.out.println("closing jocker resource");
	}

}
