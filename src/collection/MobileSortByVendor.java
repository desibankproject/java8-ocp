package collection;

import java.util.Comparator;

public class MobileSortByVendor implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.getVendor().compareTo(o2.getVendor());
	}

}
