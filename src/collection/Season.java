package collection;

public enum Season {
     WINTER(10),SPRING(20),FAIL(30);
	private int value;
	private Season(int value){
		this.value=value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public static void main(String[] args) {
		Season season=Season.SPRING;
		System.out.println(season.getValue());
		System.out.println(season.name());
		System.out.println(season.ordinal());
		System.out.println(Season.SPRING);
	}
}
