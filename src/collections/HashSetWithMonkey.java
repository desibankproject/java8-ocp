package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetWithMonkey {

	public static void main(String[] args) {
		Set<Monkey> monkeys=new HashSet<Monkey>();
		monkeys.add(new Monkey("Jack","white",100));
		monkeys.add(new Monkey("Jock","Black",500));
		monkeys.add(new Monkey("Pack","Brown",300));
		monkeys.add(new Monkey("Cate","Pink",200));
		monkeys.add(new Monkey("Mac","Cyan",700));
		monkeys.add(new Monkey("Mac","Cyan",700));
		
		for(Monkey monkey:monkeys) {
			System.out.println(monkey);
		}
		
	}
}
