package collections;

import java.util.Set;
import java.util.TreeSet;

public class TeerSetWithMonkey3 {

	public static void main(String[] args) {
		Set<Monkey> monkeys=new TreeSet<Monkey>((o1,o2)->o1.getPrice()-o2.getPrice());
		monkeys.add(new Monkey("White","Jack",100));
		monkeys.add(new Monkey("Black","Dack",500));
		monkeys.add(new Monkey("Brown","Pack",300));
		monkeys.add(new Monkey("Pink","Jam",200));
		monkeys.add(new Monkey("Cyan","Rock",700));
		monkeys.add(new Monkey("Cyan","Rock",700));
		
		for(Monkey monkey:monkeys) {
			System.out.println(monkey);
		}
		
	}
}
