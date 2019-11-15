package inner.cls;
@FunctionalInterface
public interface Adder {
	public int add(int num1,int num2);
	
	
	static	 int add(int num2){
		return 0;
	}
	
}
