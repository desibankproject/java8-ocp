package collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

 
public class TreeMapSortByVendor {
		
	public static void main(String[] args) {
		
		Mobile mobile1=new Mobile("nokia",5000,"silver");
		Mobile mobile2=new Mobile("android",9000,"white");
		Mobile mobile3=new Mobile("iphone",15000,"black");
		Mobile mobile4=new Mobile("spice",2000,"blue");
		Mobile mobile5=new Mobile("balck berry",2000,"blue");
		Mobile mobile6=new Mobile("spice",1233,"cyan");
		
		SortMobileByVendor byVendor=new SortMobileByVendor();
		
		Map<Mobile,String> mobiles=new TreeMap<Mobile,String>(byVendor);
		mobiles.put(mobile1,"Abc Store");
		mobiles.put(mobile2,"Abc Store");
		mobiles.put(mobile3,"Abc Store");
		mobiles.put(mobile4,"Abc Store");
		mobiles.put(mobile5,"Abc Store");
		mobiles.put(mobile6,"Abc Store");
		
		Set<Map.Entry<Mobile,String>> entries=mobiles.entrySet();
		for(Map.Entry<Mobile,String> entry:entries){
			System.out.println("___________________________");
			System.out.println("Key = "+entry.getKey());
			System.out.println("Key = "+entry.getValue());
		}
	
	}  
}	
	