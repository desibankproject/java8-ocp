package ocap7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ocap1.Book;

public class Q83 {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
				new Book("Gone with the wind", 5.0),
				new Book("Gone with the wind", 10.0),
				new Book("AtlasShrugged", 15.0)
				);
				books.stream().collect(Collectors.toMap((b->b.getTitle()),b->b.getPrice()))
				.forEach((a,b)->System.out.println(a+" "+b));
	}
}
