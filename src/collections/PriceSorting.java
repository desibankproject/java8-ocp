package collections;

import java.util.Comparator;

public class PriceSorting  implements Comparator<Monkey>{

	@Override
	public int compare(Monkey o1, Monkey o2) {
		return o2.getPrice()-o1.getPrice();
	}

}
