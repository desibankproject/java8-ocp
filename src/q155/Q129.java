package q155;

public class Q129 {
	public static void main(String[] args) {
		// line n1
		//Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
        byte x = 1;
		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		}
	}
}
