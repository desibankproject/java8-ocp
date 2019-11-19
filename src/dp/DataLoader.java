package dp;

import java.io.Console;

/**
 * 
 * @author Nagendra
 *  this is lazy way of instantiation!
 */
public class DataLoader {
	  private volatile static DataLoader dataLoader;
       private DataLoader() {}
      
       public static DataLoader getInstance() {
    	       if(dataLoader==null)
    	    	   synchronized (DataLoader.class) {
    	    		   if(dataLoader==null) {
    	    			      dataLoader=new DataLoader();
    	    		   }	
				}
    	       return dataLoader;
       }
}
