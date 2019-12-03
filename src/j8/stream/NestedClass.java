package j8.stream;

interface Happy{
	public String laugh(String message);
}

public class NestedClass {
	private int hhmmm=200;
	private static  int jock=300;
	
	Happy happy=new Happy() {
		@Override
		public String laugh(String message) {
			return "ahahhaqha"+message;
		}
	};
	
	public void foo() {
		System.out.println("@(@(@(foo is called");
		Happy happy=new Happy() {
			@Override
			public String laugh(String message) {
				return "ahahhaqha"+message;
			}
		};
		
	}
	//Dog class we cannot load without creating an instance of NestedClass class!!
	//Inner class
	static class Dog { 
		
		Happy happy=new Happy() {
			@Override
			public String laugh(String message) {
				return "ahahhaqha"+message;
			}
		};
		
		static int x=10;
		String name="Jack";
		public void zee() {
			Happy happy=new Happy() {
				@Override
				public String laugh(String message) {
					return "ahahhaqha"+message;
				}
			};
			
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Happy happy=new Happy() {
			@Override
			public String laugh(String message) {
				return "ahahhaqha"+message;
			}
		};
		
		NestedClass.Dog dog=new NestedClass.Dog();
		dog.zee();
	}
	
}
