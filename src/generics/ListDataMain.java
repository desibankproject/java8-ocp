package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Dog{
	String name="jacky";
	public void show(){
		System.out.println("hey my name is "+name);
	}
}
public class ListDataMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generics works only for the compiler
		List list=new ArrayList();
		list.add("String");
		list.add(1222);
		list.add(102.2);
		list.add(new Dog());
		
		Iterator it=list.iterator();
		while(it.hasNext()){
		   String str=(String)it.next();
		   System.out.println(str);
		}
	}
}
