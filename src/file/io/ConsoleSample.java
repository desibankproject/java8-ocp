package file.io;

import java.io.Console;

public class ConsoleSample {
	public static void main(String[] args) {
		Console console = System.console();
		Console console1 = System.console();
		Console console2 = System.console();
		Console console3 = System.console();
		if (console != null) {
			String userInput = console.readLine();
			console.writer().println("You entered the following: " + userInput);
			//console.printf(format, args);
			//console.format(fmt, args)
		}else {
			System.out.println("@)@(console is null since GUI based editor@@*@*");
		}
	}
}