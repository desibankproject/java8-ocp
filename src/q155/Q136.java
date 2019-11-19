package q155;

class FuelNotAvailException extends Exception {
}

class QVehicle {
	void ride() throws FuelNotAvailException {// line n1
		System.out.println("Happy Journey!");
	}
}

class SolarVehicle extends QVehicle {

public void ride () throws Exception {//line n2
	super.ride ();
}
}	

public class Q136 {
	public static void main(String[] args) throws FuelNotAvailException, Exception {
		QVehicle v = new SolarVehicle();
		v.ride();
	}
}
