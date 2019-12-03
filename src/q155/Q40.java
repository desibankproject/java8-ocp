package q155;

import java.util.Optional;

class PEmployee {
	Optional<Address> address;
	PEmployee(Optional<Address> address) {
		this.address = address;
	}
	public Optional<Address> getAddress() {
		return address;
	}
}

class Address {
	String city = "New York";
	public String getCity() {
		return city;
	}
	public String toString() {
		return city;
	}
}

public class Q40 {

}
