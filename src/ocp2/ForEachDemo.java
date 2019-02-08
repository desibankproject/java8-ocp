package ocp2;

import java.util.HashSet;
import java.util.Set;

public class ForEachDemo {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("lion");
		s.add("tiger");
		s.add("bear");
		//Lambda expression's parameter s cannot redeclare 
		//another local variable defined in an enclosing scope. 
		//s.forEach((s)->System.out.println(s));
		//Lambda expression's signature does not match the signature of 
		//the functional interface method accept(? super String)
		//s.forEach(() -> System.out.println(s));
		s.forEach((t)->System.out.println(t));
		s.forEach(t->System.out.println(t));
		//The target type of this expression must be a functional interface
		//s.forEach(System::out::println);
		s.forEach(System.out::println);
		s.forEach((String t)->System.out.println(t));
		//s.forEach(String t->System.out.println(t));
		
	}
}
