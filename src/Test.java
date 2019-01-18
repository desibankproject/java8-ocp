import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String str="1  2  3  4  5###4  5  3  2  1";
		String tokens[]=str.split("###");
		System.out.println(Arrays.asList(tokens));
	}
}
