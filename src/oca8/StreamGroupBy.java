package oca8;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ocap1.DQueueExample;

public class StreamGroupBy {
	public static void main(String[] args) {
		long a=3.4F;
		List<String> names = Arrays.asList("greg","a", "s","ab", "don", "ed", "fred");
		Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(data);
		System.out.println(data.values());
	}
}
