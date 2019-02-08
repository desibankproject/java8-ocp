/*public class Book {
	private String title;
	private String genre;

	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	// accessors not shown
}*/

/*List<Book> books = // code to create the list goes here
Comparator<Book> c1 = (b1,b2)->b1.getGenre().compareTo(b2.getGenre()); // 1
books.stream().sorted(c1.thenComparing(Book::getTitle)); // 2
System.out.println(books);*/