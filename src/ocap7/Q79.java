package ocap7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q79 {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\a\\b\\c.java");
		 String s=p1.getName(2).toString();
		 System.out.println(s);
	}
}
