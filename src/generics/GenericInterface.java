package generics;


//is it functional interface
interface Predicata<T> {
	public boolean magic(T t);
}

public class GenericInterface {
	public static void main(String[] args) {
		
		//here we are creating an object of class which is implementing  Predicata
		//since it is anonymous class
		Predicata<String> p=new Predicata<String>() {
			@Override
			public boolean magic(String t) {
				return t.contains("a");
			}
		};
		
	boolean status=p.magic("nagendra");
	if(status) {
		System.out.println(status);
	}
		
	}
}
