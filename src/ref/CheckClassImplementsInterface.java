package ref;

import java.io.Serializable;

class Hero {
	
}

class Jocker implements Serializable {
	
}

public class CheckClassImplementsInterface {
	
	public static void main(String[] args) {
		boolean g1=isSerializable(Hero.class);
		boolean g2=isSerializable(Jocker.class);
		System.out.println("g1 = "+g1);
		System.out.println("g2 = "+g2);
		
	}

	  /**
	   * Returns <code>true</code> if a class implements <code>Serializable</code>
	   * and <code>false</code> otherwise.
	   *
	   * @param c  the class.
	   *
	   * @return A boolean.
	   */
	  public static boolean isSerializable(final Class c) {
	      /**
	      final Class[] interfaces = c.getInterfaces();
	      for (int i = 0; i < interfaces.length; i++) {
	          if (interfaces[i].equals(Serializable.class)) {
	              return true;
	          }
	      }
	      Class cc = c.getSuperclass();
	      if (cc != null) {
	          return isSerializable(cc);
	      }
	       */
	      return (Serializable.class.isAssignableFrom(c));
	  }
	}