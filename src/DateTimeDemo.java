import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo {

	public static void main(String[] args,final int ahaha) {
		long px=9_223_372_036_854_775_807L;
		float x=px;
		
		final short ss=10;
		byte pl=20;
		pl=ss;
		
		char x='A'; // short , byte ,char , int
		long pp=x;
				
		final int x=19;
		final byte p=10;
		short q=90;
		char ch='A';
		int y=ch; // byte , short ,
		char g= p;
		g=x;
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
		.SHORT);
		System.out.println(f.format(d));
	}
}
