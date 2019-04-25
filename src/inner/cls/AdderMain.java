package inner.cls;

public class AdderMain {
	public static void main(String[] args) {
		/*Adder adder=(int num1,int num2)->{
			int temp=num1+num2;
			return temp;
		};*/
		/*Adder adder=(num1,num2)->{
			int temp=num1+num2;
			return temp;
		};*/
		
		Adder adder=(num1,num2)->num1+num2;
		//if we have lamda expression and we have one statement...
		//then we can use method reference
		
		int result=adder.add(90,12);
		System.out.println(result);
	}
}
