package method.ref;

interface Sum{
	public int jam(int x,int y);
}

class Amogh{
	public int add(int num1,int num2){
		return num1+num2;
	}
}

public class InstanceMethodReferenceOfAnyType {
	public static void main(String[] args) {
		
		Amogh amogh=new Amogh();
		
//		Sum sum=(int x, int y) -> amogh.add(x,y);
		Sum sum=amogh::add;
		
	/*	Sum sum=(x,y)->{
			return amogh.add(x,y);
		};*/
		//Sum sum=amogh::add; //System.out::println
		
	}
}
