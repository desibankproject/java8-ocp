import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
//		/{"Tom", "Dick", "Harry"};
		String [] names = new String[4];
		names[0]="Tom";
		names[1]="Dick";
		names[2]="Harry";
		 List<String> list = Arrays.asList(names);
		 System.out.println(list);
		 list.set(0, "Sue");
		System.out.println(names[0]);
		names[3]="Nagendra";
		System.out.println(list.get(3));
		 System.out.println(list);
	}
}
