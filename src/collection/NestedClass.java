package collection;

public class NestedClass {
      int m=100;
	  static int ggg=190;
	  
	//Nested class
	 //static class can only access static member of the outer class
	  static class Kid {
		   int x=100;
		   static int u=100;
		   public void foo() {
			   System.out.println("ggg   ="+ggg);
		   }
		   
	}
	
	public static void foo() {
		System.out.println(")@)@)@)@foo is called!");
	}
	
	public static void main(String[] args) {
		//Here we are creating an instance of Kid
		NestedClass.Kid  kid=new NestedClass.Kid(); 
		kid.foo();
		
		NestedClass.foo();
	}
	
}
