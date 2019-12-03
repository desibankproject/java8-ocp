
public class Komoa {
	public static void main(String[] args) {
		int[][] game = new int[3][3];
		game[2][2] = 4;
		System.out.println(game[2][2]);
		Object[] paa = game;
		//paa is object ....you cannot use it to access the elements of the array.
		//we have to type case it , before to use
		//System.out.println(paa[2] [2]);
		System.out.println(((int[]) paa[2]) [2]);
		//System.out.println(paa[2]);
		System.out.println(game[2][2]);
		((int[]) paa[2]) [2]=99;
		System.out.println(((int[]) paa[2]) [2]);
		Object pa=game;
		((int[][])pa) [2] [2]=230;
		System.out.println(((int[][])pa) [2] [2]);
	}
}
