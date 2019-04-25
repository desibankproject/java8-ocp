package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class ToMapExample {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(100, "Mohan"));
		list.add(new Customer(200, "Sohan"));
		list.add(new Customer(300, "Mahesh"));
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(Customer::getId, Customer::getName));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}
} 