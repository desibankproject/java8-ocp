package ocp2;

public class Generic<T> {
	public static void main(String[] args) {
		 	 //Generic<String> g = new Generic<?>();
			 Generic<String> g = new Generic<String>();
			 Generic<?> g1 = new Generic<String>();
			 Generic<Object> g2 = new Generic();
	}
}
