package ocap1;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Freedom atMidnight", 5.0),
				new Book("Gone with thewind", 5.0),
				new Book("MidnightCowboy", 15.0)
				);
				books.stream()
				.filter(b->b.getTitle().startsWith("F"))
				.forEach(b->b.setPrice(10.0));
				books.stream()
				.forEach(b->System.out.println(b.getTitle()+":"+b.getPrice()));
	}
}
