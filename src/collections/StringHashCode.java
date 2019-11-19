package collections;

public class StringHashCode {
	public static void main(String[] args) {
		String str1=new String("Hmm");
		String str2=new String("Hmm");
		if(str1!=str2) {
			System.out.println("Ahahha I understand it!!");
		}
		boolean t=str2.equals(str1);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
