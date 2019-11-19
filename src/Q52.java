
public class Q52 {

	public static void main(String[] args) {
		String days[]= {"sun","mon","wed","sat"};
		int wd=0;
		for(String day:days) {
			switch (day) {
			case "sat":
			case "sun":
				wd -=1;
				break;
			case "mon":
				wd++;
			case "wed":
				wd+=2;	
		   }
		}
		System.out.println(wd);
		
	}
}
