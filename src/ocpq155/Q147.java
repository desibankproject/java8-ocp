package ocpq155;

import java.time.LocalDate;

public class Q147 {
	public static void main(String[] args) {
		LocalDate localDate=LocalDate.of(2012,01, 32);
		localDate.plusDays(10);
		System.out.println(localDate);
	}
}
