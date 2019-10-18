package functional;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String,StringBuilder>  oaoa=t -> new StringBuilder(t);
		StringBuilder builder=oaoa.apply("Nagendra");
		
		
		Function<Person,String> function=(Person p)->{
			String result="";
			if(p.getAge()<20){
				result="he is less than 20 years old";
			}else{
				result="he is greater than equal 20 years old";
			}
			return result;
		};
	}

}
