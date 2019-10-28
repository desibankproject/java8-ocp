package collection;

import java.util.TreeSet;

 
public class TreeSetMobileDemo {
		
	public static void main(String[] args) {
		
		Mobile mobile1=new Mobile("nokia",5000,"silver");
		Mobile mobile2=new Mobile("android",9000,"white");
		Mobile mobile3=new Mobile("iphone",15000,"black");
		Mobile mobile8=new Mobile("aahhaha",400,"black");
		Mobile mobile4=new Mobile("spice",2000,"blue");
		Mobile mobile5=new Mobile("ios",9000,"green");
		Mobile mobile6=new Mobile("ios",95959,"tingo");
		
		
		//type inference
		TreeSet<Mobile> mobiles=new TreeSet<>();
		mobiles.add(mobile1);
		mobiles.add(mobile2);
		mobiles.add(mobile3);
		mobiles.add(mobile4);
		mobiles.add(mobile5);
		mobiles.add(mobile6);
		
		mobiles.add(mobile8);
		for(Mobile m:mobiles){
			System.out.println(m);
		}
	
	}  
}	
	