package ocap1;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		String line;
		Console c = System.console();
		/*char paa[]=c.readPassword();
		System.out.println(new String(paa));*/
		//String line="";
		if ((line = c.readLine()) != null)
		System.out.println(line);
	}
}



