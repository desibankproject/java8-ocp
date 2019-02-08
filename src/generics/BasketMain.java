package generics;

/**
 * 
 * @author Nagendra
 * I want to make generic class 
 */
class Apple{
	private String taste;
	
	public Apple(String taste) {
		super();
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Apple [taste=" + taste + "]";
	}
	
}
 class Basket<T> {
	private T data;
	public Basket(T data){
		this.data=data;
	}
	
	public T getValue(){
		return this.data;
	}
}
 public class BasketMain{
	 public static void main(String[] args) {
		 Basket<String> sdata=new Basket<String>("Nagendra");
		 String result1=sdata.getValue();
		 System.out.println(result1);
		 
		 Apple apple=new Apple("sweet");
		 Basket<Apple> appleData=new Basket<Apple>(apple);
		 Apple result2=appleData.getValue();
		 System.out.println(result2);
	 }
 }
