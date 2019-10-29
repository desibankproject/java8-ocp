package q155;

public class Q45 {
	public static void main(String[] args) {
		Q45 ts=new Q45();
		System.out.print(isAvailable+" ");
		isAvailable=doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff() {
		return !isAvailable;
	}
	static boolean isAvailable=false;
}
