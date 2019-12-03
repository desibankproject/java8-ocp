package q155;


final class A1{
	public A1() {
	}
}

 class A2{
	private static int i;
	private  A2() {
	}
}

 final abstract class A5{
	 protected static int i;
	 void  doStuff() {}
	 abstract void doIt();
 }
 
  class A4{
	  //The blank final field i may not have been initialized
	   protected static final int i;
	   private void  doStuff() {}
	}
  abstract class A3{
	  private  static int i;
	  public void  doStuff() {}
	  public A3() {}
  }


public class Q117 {

}
