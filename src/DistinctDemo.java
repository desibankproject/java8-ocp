import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
	public static void main(String[] args) {
		
		Cat cat1=new Cat("Jack","white");
		Cat cat2=new Cat("Jack","white");
		Cat cat3=new Cat("Jack","black");
		Cat cat4=new Cat("Popping","yellow");
		
		List<Cat> cats=Arrays.asList(cat1,cat2,cat3,cat4);
		
		cats.stream().distinct().forEach(System.out::println);
		
	}
}
