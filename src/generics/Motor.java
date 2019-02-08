package generics;

public class Motor {
	private String fuelType;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Motor [fuelType=" + fuelType + "]";
	}

}
