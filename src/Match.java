
public class Match {

	public static void main(String[] args) {
		System.out.println(main(45));
	}
	
	public static int main(int x) {
		try {
			    x=x+55;
			    if(x==100) {
			    	return x; //return 100
			    }
		}finally {
				x=x+20;
				System.out.println("x= x = "+x);
		}
		return x+1;
	}
}
