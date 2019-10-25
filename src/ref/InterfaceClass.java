package ref;

import java.util.Scanner;

public class InterfaceClass {
	  public static void main(String[] args) {
	    // Checking whether Cloneable is an interface or class
			//Write a program to instantiate a class which you would come to know at runtime only
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter class name please");
			String className=scanner.next();
			//Loading the class inside the metaspace
			try {
				//forName
				Class genClass= Class.forName(className);
			   // Class clazz = Cloneable.class;
			    boolean isInterface = genClass.isInterface();
			    System.out.println("Is Interface = " + isInterface);
			}catch (Exception e) {
				e.printStackTrace();
			}
	
	  }
	}