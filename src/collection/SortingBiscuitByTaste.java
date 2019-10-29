package collection;

import java.util.Comparator;

public class SortingBiscuitByTaste implements Comparator<Biscuit>{

	@Override
	public int compare(Biscuit o1, Biscuit o2) {
		//This sorting would be descending
		//compareTo is used for String comparison
		int p=o2.getTaste().compareTo(o1.getTaste());
		//when both are same then it returns 0
		if(p==0){
			p=o2.getBid()-o1.getBid();
		}
		return p;
	}

}
