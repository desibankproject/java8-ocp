package inner.cls;

public class MethodReferences2 {
		public static void main(String[] args) {
			//Adder adder=(num1,num2)->num1+num2;
			//if we have lamda expression and we have one statement...
			//then we can use method reference
			Jocker jocker=new Jocker();
			Adder adder=jocker::jack;
			int result=adder.add(90,12);
			System.out.println(result);
		}
}
class Jocker {
	public  int sum(int x,int y){
		return x+y;
	}
	 public  int jack(int x,int y){
		return x-y;
	}
}
