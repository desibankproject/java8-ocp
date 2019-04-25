package j8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindAnyExample {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("monkey");
		list.add("gorilla");
		list.add("bonobo");
		Predicate<String> predicate=x->Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(predicate));
		System.out.println(list.stream().allMatch(predicate));
		System.out.println(list.stream().noneMatch(predicate));
	}
}
