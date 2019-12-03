package thread;

public class MallMain {

	public static void main(String[] args) {
		
		Human human1=new Human("Jack");
		Human human2=new Human("Maks");
		Human human3=new Human("Robert");
		human1.start();
		human2.start();
		human3.start();
		
		System.out.println("Hey! this is mall!!!!!!!!!!!!!");
		
	}
	
}
