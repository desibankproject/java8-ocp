package ocp5;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args) {
		Scanner scanner=null;
		try {
		 scanner=new Scanner(System.in);
		System.out.println("Enter your name please");
		String name=scanner.nextLine();
		System.out.println("hey!  "+name);
		}finally {
		if(scanner!=null)
			scanner.close();
		}
	}

}
