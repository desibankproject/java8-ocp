package gen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericeMethod3 {
	
	
	public static  void printa(List<?> data){
		
	}
	
	public static void main(String[] args) {
			List<String> list=Arrays.asList("Nagendra","OCA","@(@(@");
			printa(list);
			List<Integer> nums=Arrays.asList(12,123,45,1);
			printa(nums);
			
			List<Customer> customers=Arrays.asList(new Customer(),new Customer());
			printa(customers);
			//
			List<? extends String> ref=new ArrayList<String>();
			
			List<? extends Exception> ex1=new ArrayList<Exception>();
			List<? extends Exception> ex2=new ArrayList<IOException>();
			List<? extends IOException> ex3=new ArrayList<IOException>();
			//List<? extends IOException> ex4=new ArrayList<Exception>();
			List<? extends IOException> ex5=new ArrayList<FileNotFoundException>();
	}

}
