package collection;

import java.util.Comparator;

public class SortMobileByVendor implements Comparator<Mobile> {

	@Override
	public int compare(Mobile m1,Mobile m2){
		return m2.getVendor().compareTo(m1.getVendor());
	}
}
