package file;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

class MyCom implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
	}
}

public class MaxMin {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList (10, 20, 8);
		int mx=nums.stream().max(Comparator.comparing(a -> a)).get();
		System.out.println(mx);
		
		int my=nums.stream().max(Integer :: max).get();
		System.out.println(my);
	}
	
}
