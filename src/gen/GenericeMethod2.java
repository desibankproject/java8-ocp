package gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Customer  implements Comparable<Customer>{

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class GenericeMethod2 {
	
	
	public static  <T extends Comparable<T>>  void printa(List<T> data){
		
	}
	
	public static void main(String[] args) {
			List<String> list=Arrays.asList("Nagendra","OCA","@(@(@");
			printa(list);
			List<Integer> nums=Arrays.asList(12,123,45,1);
			printa(nums);
			
			List<Customer> customers=Arrays.asList(new Customer(),new Customer());
			printa(customers);
			
	}

}
