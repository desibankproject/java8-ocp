package collection;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.ringtone();
		mobile=new Samsung();
		mobile.ringtone();
		mobile=new HTCMobile();
		mobile.ringtone();
	}
}
