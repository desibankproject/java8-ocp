package method.ref;


interface GenMario{
	public Mario  get(String name);
}

public class ConstructorReference {

	public static void main(String[] args) {
		GenMario genMario1=new GenMario() {
			@Override
			public Mario get(String name) {
				return new Mario(name);
			}
		};
		GenMario genMario2=(String name)  ->new Mario(name);
		GenMario genMario3=Mario::new;
		Mario mario=genMario2.get("@))@(@@(");
		main(Mario::new);
	}
	
	
	private static void main(GenMario genMario2) {
		
		
	}
	
}
