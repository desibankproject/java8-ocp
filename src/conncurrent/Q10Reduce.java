package conncurrent;

import java.util.Arrays;

public class Q10Reduce {

	public static void main(String[] args) {
		int result=Arrays.asList("duck","chicken","flamingo","pelican").
		parallelStream().parallel().reduce(0,(c1,c2)->c1+c2.length(),(s1,s2)->s1+s2);
		System.out.println(result);
		
	}
}
