package gen;

import java.util.Arrays;
import java.util.List;

public class GenericeMethod3 {
	
	
	public static    void printa(List<?> data){
		
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
