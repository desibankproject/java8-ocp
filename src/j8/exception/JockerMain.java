package j8.exception;

public class JockerMain {
	public static void main(String[] args) throws Exception {
		//try with resource 	
		try(Jocker jocker1=new Jocker("A");Jocker jocker2=new Jocker("B");){
			System.out.println("This is try");
			System.out.println("This is try complete");
			Exception exception=new Exception("Yeap");
			throw exception;
		}
	}
}
