package ocap1;

import java.io.IOException;

public class ExeptionDemo {
	public static void main(String[] args) {
		try {   throw new IOException(); } 
		catch(IOException | RuntimeException e) {  
			//The parameter e of a multi-catch block cannot be assigned
			//e = new RuntimeException();           
			// DOES NOT COMPILE 
		}
	}
}
