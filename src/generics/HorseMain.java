package generics;

import java.util.ArrayList;
import java.util.List;

public class HorseMain {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Horse horse=new Horse();
		//super class can reference an instance of subclass
		animal=new Horse(); 
		//co-variant rule....
		Object str="Nagendra";
		//Here List is interface for ArrayList
		List<String> pops=new ArrayList<>(); 
	}
}
