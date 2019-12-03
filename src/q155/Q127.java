package q155;

public class Q127 {
	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		int x=array.length;
		while(x>0) {
			System.out.print(array[--x]);
		}
		
		/*do{
			x--;	
			System.out.print(array[x]);
		}while(x>=0); 
		
		do{
			System.out.print(array[x]);
			x--;
		}while(x>=0);
		
		while(x>=0) {
			System.out.print(array[x]);
			x--;
		}*/
		x=array.length;
		while(x>0) {
			x--;
			System.out.print(array[x]);
		}
	}
}
