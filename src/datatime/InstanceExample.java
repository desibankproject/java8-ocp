package datatime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstanceExample {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		
		
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
		System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
		System.out.println(instant); // 2015–05–25T15:55:00Z
		
		ZonedDateTime dateTime=ZonedDateTime.now();
		Instant instant2=dateTime.toInstant();
		System.out.println("dateTime  = "+dateTime);
		System.out.println("instant2  = "+instant2);
		
	}
}
