package method.ref;


@FunctionalInterface
interface Math {
	public float add(int num1,float num2);
}

class Utility {
	public static float sum(int n1,float n2){
			return n1+n2;
	}
}

public class MethodRefStatic {
	 public static void main(String[] args) {
		 Math math=(num1,  num2)-> Utility.sum(num1, num2);
		 float resulta=math.add(12,12.3F);
		 Math math2=Utility::sum;
		 
		 Math math3=new Math() {
			@Override
			public float add(int num1, float num2) {
						return Utility.sum(num1, num2);
			}
		};
	}
}
