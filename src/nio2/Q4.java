package nio2;

import java.util.function.BiPredicate;

public class Q4 {
	public static void main(String[] args) {
		//Either do not specify data types for the input or 
		//both the data types are mandatory
		BiPredicate<String,String> oppo=(String a,String b)->{return true;};
	}
}
