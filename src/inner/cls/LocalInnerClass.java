package inner.cls;
 enum Directions {
    NORTH, WEST, SOUTH, EAST
}
public class LocalInnerClass {
	int mocker=800;	
	static int jai=700;	
	int x=81928;
	
	public void show(){
		int x=100;
		//x=90;
		if(x==100){
			int g=900;
			//g=12; =>>Local variable g defined in an enclosing scope must be final or effectively final
			class Jocker{
				int mo=90;
				private final static int p=22;
				void show(){
					System.out.println("mo = "+mo);
					System.out.println("g = "+g);
					System.out.println("mo = "+mo);
					System.out.println("x = "+x);
					System.out.println("mocker = "+mocker);
					System.out.println(LocalInnerClass.this.x);
					System.out.println(jai);
					System.out.println(p);
				}
			}
			new Jocker().show();
		}
	}
	
	public static void main(String[] args) {
			new LocalInnerClass().show();
	}
}
