import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DistinctSorting {
	public static void main(String[] args) {
		
		Cat cat1=new Cat("Jack","white");
		Cat cat2=new Cat("Jack","white");
		Cat cat3=new Cat("Jack","black");
		Cat cat4=new Cat("Popping","yellow");
		List<Cat> cats=Arrays.asList(cat1,cat2,cat3,cat4);
		
		/*cats.stream().sorted(Comparator.comparing(Cat::getName).
				thenComparing(Cat::getColor).
				reversed()).forEach(System.out::println);*/
		cats.stream().sorted((c1,c2)->c1.getName().compareTo(c2.getName())).forEach(System.out::println);
		
		
	}
}
