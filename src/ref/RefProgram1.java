package ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Rado {
	private int price;
	private Rado() {
		  System.out.println("Rado!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	  }
	
	public void show() {
		System.out.println("Show method is called!!!!!!!!!!!!");
	}
}

public class RefProgram1 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Rado> rd=Rado.class;
		//rd contains? all the informations about class Rado
		Constructor  c=rd.getDeclaredConstructor();
		c.setAccessible(true);
		Rado rado =(Rado)c.newInstance();
		rado.show();
	}

}
