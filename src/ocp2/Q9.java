package ocp2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class A {}
class B extends A {}
class C extends B {}
//The type parameter C is hiding the type C
class D<C> {
	//Type mismatch: cannot convert from C to A
	//A a3 = new C();
	 //Cannot instantiate the type C
	 //C c1 = new C();
	 A a1 = new A();
}

public class Q9 {
	
	public static <E extends Number> 
		void someMethod(List<E> numberList) {
		  E number = numberList.get(0); 
		  numberList.add(number);
	}
	
	
	
	
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("1","2", "3");
		 Iterator iter = list.iterator();
		  while(iter.hasNext())
			  System.out.print(iter.next());
		 // Runnable runnable=()->"9292";
		  Consumer<String> p=s->System.out.println(s);
		/*  BiConsumer<String,String> q=(String s,t)->System.out.println(s);*/
	}
}
