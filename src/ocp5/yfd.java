package ocp5;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class yfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s =Stream.of("speak", "bark", "meow","growl");

		Map<Integer, String> map =s.collect(Collectors.toMap(String::length, k -> k));

		System.out.println(map.size() + "" + map.get(4));
	}

}
