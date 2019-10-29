package collection;


public class StringDemo {
	
	private String a;
	private String b;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringDemo d1=new StringDemo();
		d1.a="hello";
		d1.b="hi";
		
		StringDemo d2=new StringDemo();
		d2.a="hi";
		d2.b="hello";
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}

}
