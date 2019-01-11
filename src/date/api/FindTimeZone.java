package date.api;

import java.time.ZoneId;

public class FindTimeZone {
	public static void main(String[] args) {
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println(zoneId);
	}
}
