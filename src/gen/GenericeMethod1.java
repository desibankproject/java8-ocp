package gen;

import java.util.Arrays;
import java.util.List;

public class GenericeMethod1 {
	
	
	public static  <T>  void printa(List<T> data){
		
	}
	
	public static void main(String[] args) {
			List<String> list=Arrays.asList("Nagendra","OCA","@(@(@");
			printa(list);
			List<Integer> nums=Arrays.asList(12,123,45,1);
			printa(nums);
	}

}
