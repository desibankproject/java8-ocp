package ocp2;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Q2 {
	public static void main(String[] args) {
		 ArrayDeque<?> list = new ArrayDeque<String>();
		 Map<Integer, Integer> map = new HashMap<>(10);
		 for (int i = 1; i <= 10; i++) {
			 map.put(i, i * i);
		 }
		 System.out.println(map.get(4));
	}
}
