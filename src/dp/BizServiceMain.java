package dp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BizServiceMain {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BizService bizService1=BizService.getInstance();
		//BizService bizService2=new BizService(); // - >The constructor BizService() is not visible
		BizService bizService2=BizService.getInstance();
	   if(bizService1==bizService2) {
	          System.out.println("Ahah this is singleton design pattern!!!!!!!!!!!!!");
	   }
	   
	     Constructor c = BizService.class.getDeclaredConstructor();
	     c.setAccessible(true); // solution
	      c.newInstance();
	      c.newInstance();
	      c.newInstance();
	      c.newInstance();
	      c.newInstance();
	      c.newInstance();
	      c.newInstance();
	
	}
}
