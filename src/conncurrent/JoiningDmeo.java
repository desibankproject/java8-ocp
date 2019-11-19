package conncurrent;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningDmeo {

	public static void main(String[] args) {
		 List<Integer> numbers=Arrays.asList(19,283,927,192,282);
		String csv = numbers.stream()
	            .map(String::valueOf) //Stream<String>
	            .collect(Collectors.joining(", ","Mr.","Done"));
		System.out.println(csv);
	}
}
