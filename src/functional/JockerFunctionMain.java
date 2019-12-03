package functional;

import java.util.function.Function;

public class JockerFunctionMain {

	public static void main(String[] args) {
		
		//Function<String,Jocker> function=(String t) ->new Jocker(t);
		Function<String,Jocker> function=Jocker::new;
		Jocker jocker=function.apply("Jacks!!");
        System.out.println(jocker);		
	}
}
