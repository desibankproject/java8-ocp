package ocp2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Q49 {
		public static void main(String[] args) {
			ZoneId zone = ZoneId.of("US/Eastern");
			LocalDate date =LocalDate.of(2015, 3, 13);
			LocalTime time1 = LocalTime.of(2, 15);
			ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
			System.out.println(a);
		}
}
