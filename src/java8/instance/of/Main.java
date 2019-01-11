package java8.instance.of;

public class Main {

	public static void main(String[] args) {
		Samsung samsung=new Samsung();
		boolean b1=samsung instanceof Samsung;
		boolean b2=samsung instanceof Mobo;
		//boolean b3=samsung instanceof Nokia;
		
		boolean b4=samsung instanceof CBase;
		
	}
	
}
