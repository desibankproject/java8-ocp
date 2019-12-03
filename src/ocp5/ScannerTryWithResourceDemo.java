package ocp5;

import java.util.Scanner;

public class ScannerTryWithResourceDemo {
	
	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in);) {
			System.out.println("Enter your name please");
			String name=scanner.nextLine();
			System.out.println("hey!  "+name);
		}
	}

}
