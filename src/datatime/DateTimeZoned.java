package datatime;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTimeZoned {
	public static void main(String[] args) {
		 LocalTime nowInUtc = LocalTime.now(Clock.systemUTC());
		  System.out.println(nowInUtc); // 06:08:18.125
		  ZonedDateTime dateTime=ZonedDateTime.now();
		  System.out.println(dateTime);
	}	
}
