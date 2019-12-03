package generics;

public class GenericsClassMain {
	public static void main(String[] args) {
		GenericsClass class1=new GenericsClass(8292);
		Object object=class1.showData();
		System.out.println(object);
		GenericsClass<String> class2=new GenericsClass<String>("Hey! I understand Generics!!!!!!!!!!!!!");
		String result=class2.showData();
		System.out.println(result);
		
		GenericsClass<Double> class3=new GenericsClass<Double>(34.3D);
		Double dresult=class3.showData();
		System.out.println(dresult);
		
	}
}
