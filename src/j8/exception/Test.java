package j8.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;


public class Test  implements Callable<Integer>{
	public static void main(String[] args) {
	}
	
	public void execute(){
	      try {
	    	  
	      } catch (Exception e) {
			e.printStackTrace();
	      }finally{
	    	  
	      }
		}
	
	public static void caller()throws IOException {
	     int x=1000;
		  int y=x/0;		
	}

	@Override
	public Integer call()  {
		return null;
	}
}
