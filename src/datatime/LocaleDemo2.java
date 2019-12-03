package datatime;

import java.nio.file.Files;
import java.util.Locale;

public class LocaleDemo2 {

	public static void main(String[] args) {
		 System.out.println(new Locale("fr")); // fr
		 System.out.println(new Locale("hi", "IN")); // hi_IN 
		 
		 Locale l1 = new Locale.Builder()
				 .setLanguage("en")
				 .setRegion("US")
				 .build();
				 Locale l2 = new Locale.Builder()
				 .setRegion("US")
				 .setLanguage("en")
				 .build(); 
				
	}
}
