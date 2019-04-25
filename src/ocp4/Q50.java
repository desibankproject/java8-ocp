package ocp4;

class Wash<T> {
	  T item;
	  public void clean(T item) {
	     System.out.println("Clean "+ item);
	  }
}	

public class Q50 {
	public static void main(String[] args) {
		Wash<String> wash = new Wash();
		wash.clean("socks");
	}
}


