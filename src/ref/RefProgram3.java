package ref;

import java.util.Scanner;

public class RefProgram3 {
	public static void main(String[] args) {
		//Write a program to instantiate a class which you would come to know at runtime only
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter class name please");
		String className=scanner.next();
		//Loading the class inside the metaspace
		try {
			//forName
			Class genClass= Class.forName(className);
			Object object=genClass.newInstance();//new String("");
			Object object1=new String();
			System.out.println(object);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
