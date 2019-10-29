
enum Hero {
	ROBERT("Maker") {
		@Override
		public void cool() {
			
		}
	},MAKS("Mr."),TOM("Oped") ;
	
	private String title;
	Hero(String title) {
		System.out.println("Hero is called");
		this.title=title;
	}
	
	public  void cool() {
		
	}
	
	@Override
	public String toString() {
		return title;
	}
}

public class Movie {
	public static void main(String[] args) {
		Hero hero=Hero.valueOf("ROBERT");
		System.out.println(hero.ordinal());
		switch(hero) {
		case ROBERT:
			System.out.println("SJSJS");
			break;
		}
	}
}
