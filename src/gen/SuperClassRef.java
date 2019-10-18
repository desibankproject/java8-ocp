package gen;

class A{
	
	public void show(){
		System.out.println("Show1228282828A");
	}
	
}
class B extends A {
	public void show(){
		System.out.println("BBB@*@*@*@*@&*");
	}
}

public class SuperClassRef {
	public static void main(String[] args) {
		 A ref=new B();  //ref is B type and ref is A type
		 ref.show();
	}
}
