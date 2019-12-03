package q155;

public class Pest{
	int a1; //11
	public static void doProduct(int a) {//a=10
		a=a*a;
	}
	public static void doString(StringBuilder s) {
		s.append(" "+s);
	}
	
	 public static void main(String[] args) {
		   Pest pest=new Pest();
		   pest.a1=11;
		   StringBuilder sb=new StringBuilder("Hello");
		   Integer i=10; 
		   doProduct(i);
		   doString(sb);
		   doProduct(pest.a1);
		   System.out.println(i+  "    "+sb+"  "+pest.a1);
	}
	
}
 class Q787 {
  
}
