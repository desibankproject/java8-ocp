package datatime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class ISODateDemo {

	 public static void main(String[] args) {
		 
		 LocalDate localDate=LocalDate.now();
		 System.out.println(localDate);
		 System.out.println(LocalDateTime.now());
		 Instant instant=Instant.now();
		 System.out.println(instant);
		 System.out.println(ZonedDateTime.now());
		 
	 }
}
