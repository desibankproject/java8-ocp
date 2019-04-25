package inner.cls;

public class MethodReferences {
		public static void main(String[] args) {
			//Adder adder=(num1,num2)->num1+num2;
			//if we have lamda expression and we have one statement...
			//then we can use method reference
			Adder adder=Magic::jack;
			int result=adder.add(90,12);
			System.out.println(result);
		}
}
class Magic {
	public static int sum(int x,int y){
		return x+y;
	}
	public static int jack(int x,int y){
		return x-y;
	}
}
