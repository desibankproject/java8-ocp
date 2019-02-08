package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CDog{
	String name="jacky";
	public void show(){
		System.out.println("hey my name is "+name);
	}
}
public class ListWithGenerics {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generics works only for the compiler
		List<String> list=new ArrayList<>();//this is called type inference - JAVA 7 and onwards
		list.add("String");
		/*list.add(1222);
		list.add(102.2);
		list.add(new Dog());*/
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
		   String str=it.next();
		   System.out.println(str);
		}
	}
}