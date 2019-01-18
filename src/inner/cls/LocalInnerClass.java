package inner.cls;

public class LocalInnerClass {
	int mocker=800;	
	static int jai=700;	
	public void show(){
		int x=100;
		//x=90;
		if(x==100){
			int g=900;
			//g=12; =>>Local variable g defined in an enclosing scope must be final or effectively final
			class Jocker{
				int mo=90;
				void show(){
					System.out.println("mo = "+mo);
					System.out.println("g = "+g);
					System.out.println("mo = "+mo);
					System.out.println("x = "+x);
					System.out.println("mocker = "+mocker);
					System.out.println(jai);
				}
			}
			new Jocker().show();
		}
	}
	
	public static void main(String[] args) {
			new LocalInnerClass().show();
	}
}
