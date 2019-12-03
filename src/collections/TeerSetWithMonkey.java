package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class SortMonkeyByColor implements Comparator<Monkey>{
	@Override
	public int compare(Monkey o1, Monkey o2) {
		return o2.getColor().compareTo(o1.getColor());
	}
}

public class TeerSetWithMonkey {

	public static void main(String[] args) {
		Set<Monkey> monkeys=new TreeSet<Monkey>(new SortMonkeyByColor());
		monkeys.add(new Monkey("White","Jack",100));
		monkeys.add(new Monkey("Black","Dack",500));
		monkeys.add(new Monkey("Brown","Pack",300));
		monkeys.add(new Monkey("Pink","Jam",200));
		monkeys.add(new Monkey("Cyan","Rock",700));
		monkeys.add(new Monkey("qweqe","E324",700));
		
		for(Monkey monkey:monkeys) {
			System.out.println(monkey);
		}
		
	}
}
