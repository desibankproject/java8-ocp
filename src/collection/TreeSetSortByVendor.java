package collection;

import java.util.TreeSet;

 
public class TreeSetSortByVendor {
		
	public static void main(String[] args) {
		
		Mobile mobile1=new Mobile("nokia",5000,"silver");
		Mobile mobile2=new Mobile("android",9000,"white");
		Mobile mobile3=new Mobile("iphone",15000,"black");
		Mobile mobile4=new Mobile("spice",2000,"blue");
		Mobile mobile5=new Mobile("balck berry",2000,"blue");
		Mobile mobile6=new Mobile("spice",1233,"cyan");
		
		SortMobileByVendor byVendor=new SortMobileByVendor();
		
		TreeSet<Mobile> mobiles=new TreeSet<>(byVendor);
		mobiles.add(mobile1);
		mobiles.add(mobile2);
		mobiles.add(mobile3);
		mobiles.add(mobile4);
		mobiles.add(mobile5);
		mobiles.add(mobile6);
		
		for(Mobile m:mobiles){
			System.out.println(m);
		}
	
	}  
}	
	