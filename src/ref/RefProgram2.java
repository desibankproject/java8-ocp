package ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Joomla {
	private int price;
	public Joomla(int price) {
		super();
		System.out.println("price = "+price);
		this.price = price;
	}
	
	public Joomla(Integer price) {
		super();
		System.out.println("price = "+price);
		this.price = price;
	}

	public Joomla() {
		  System.out.println("Joomla");
	  }
	
	public void show() {
		System.out.println("Show method is called!!!!!!!!!!!! price = "+price);
	}
}

public class RefProgram2 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<Joomla> rd=Joomla.class;
		//rd contains? all the informations about class Rado
		Constructor  c=rd.getDeclaredConstructor(int.class);
		Joomla joomla =(Joomla)c.newInstance(123);
		joomla.show();
	}

}
