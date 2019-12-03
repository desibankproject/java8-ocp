package datatime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateAndTime2 {
	public static void main(String[] args) {
		ZoneId zoneId=ZoneId.of( "Asia/Kolkata" );
		LocalDateTime datetimeKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime india=ZonedDateTime.of(datetimeKolkata, zoneId);
		System.out.println(india);
		System.out.println("Print UTC Time from India Time = "+india.toInstant());
		
		Instant instant=Instant.now();
		System.out.println(instant);
		
		ZonedDateTime zonedDateTime=ZonedDateTime.now();
		System.out.println(zonedDateTime);
	}

}
