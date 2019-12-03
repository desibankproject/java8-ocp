package collection;

class Ahhaha extends Object {
	
	private String color;
	
	public Ahhaha(String color) {
		super();
		this.color = color;
	}
	
	@Override
	public boolean equals(Object o){
		Ahhaha ahhaha=(Ahhaha)o;
		return color.equals(ahhaha.color);
	}
	
	@Override
	public String toString() {
		return "Ahhaha [color=" + color + "]";
	}
}

public class HashCodeMagic {
	public static void main(String[] args) {
		Ahhaha ob1=new Ahhaha("pink");
		Ahhaha ob2=new Ahhaha("pink");
		Ahhaha ob3=new Ahhaha("pink");
		
		System.out.println("ob1.hashCode() = "+ob1.hashCode());
		System.out.println("ob1.hashCode() = "+ob1.hashCode());
		System.out.println("ob1.hashCode() = "+ob1.hashCode());
		System.out.println("ob1.hashCode() = "+ob1.hashCode());
		System.out.println("ob1.hashCode() = "+ob1.hashCode());
		System.out.println("ob2.hashCode() = "+ob2.hashCode());
		System.out.println("ob3.hashCode() = "+ob3.hashCode());
		if(ob1.equals(ob2)){ //reference equality
			System.out.println("B2 hashCOde() = "+ob2.hashCode());
		}
		if(ob1==ob2){
			System.out.println("B2 hashCOde() = "+ob2.hashCode());
		}
	}
}
