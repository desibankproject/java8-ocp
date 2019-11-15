import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		String date=LocalDateTime.parse("2018-09-25T14:12:35").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
		//getClass is define inside Object as a native method
		System.out.println(date.getClass());
		//class 
	}
}
