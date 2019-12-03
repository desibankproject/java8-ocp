package gen;

import java.util.Arrays;
import java.util.List;

class Dog implements Comparable<Dog> {
	String name="road!";
	public void showName() {
		System.out.println("name is = "+name);
	}
	@Override
	public int compareTo(Dog o) {
		return name.compareTo(o.name);
	}
	
}

public class GenericeMethod1 {
	
	
	public static  <T extends Comparable<T>>  void print(List<T> data){
		
	}
	
	public static  <T>  void printa(List<T> data){
		
	}
	
	public static void main(String[] args) {
			List<String> list=Arrays.asList("Nagendra","OCA","@(@(@");
			printa(list);
			List<Integer> nums=Arrays.asList(12,123,45,1);
			printa(nums);
			print(list);
			
			List<Dog> listdog=Arrays.asList(new Dog(),new Dog(),new Dog());
			printa(listdog);
			print(listdog);
	}

}
