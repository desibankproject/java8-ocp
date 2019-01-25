package ocap1;

public enum AnimalClasses {
	MAMMAL(true), FISH(Boolean.FALSE), BIRD(false), 
	REPTILE(false), AMPHIBIAN(false), 
	INVERTEBRATE(false);

	boolean hasHair;
	//Illegal modifier for the enum constructor; only 
	//private is permitted.
	 AnimalClasses(boolean hasHair) {
		this.hasHair = hasHair;
	}
}