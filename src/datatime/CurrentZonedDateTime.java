package datatime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CurrentZonedDateTime {

	public static void main(String[] args) {
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime datetimeKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(datetimeKolkata);
		ZoneId zoneId=ZoneId.of( "Asia/Kolkata" );
		ZonedDateTime india=ZonedDateTime.of(datetimeKolkata, zoneId);
		System.out.println(india);
		
		 LocalTime nowInUtc = LocalTime.now(Clock.systemUTC());
		  System.out.println(nowInUtc); // 06:08:18.125
		  
		  Period wrong = Period.ofWeeks(1);

	}
}
