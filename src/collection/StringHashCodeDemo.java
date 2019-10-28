package collection;

public class StringHashCodeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1=new String("INDIA");
		String str2=new String("INDIA");

		System.out.println("str1.hashCode() = "+str1.hashCode());
		System.out.println("str2.hashCode() = "+str2.hashCode());

	}

}
