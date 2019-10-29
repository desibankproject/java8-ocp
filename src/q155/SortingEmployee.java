package q155;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Brezza {
	private String name;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", color=" + color + "]";
	}

}

public class SortingEmployee {
	public static void main(String[] args) {
		List<Brezza> vehicles=new ArrayList<Brezza>();
		vehicles.stream().sorted(Comparator.comparing(Brezza::getName).reversed().
				thenComparing(Brezza::getColor)).collect(Collectors.toList());
		
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		//Stream<Integer>
		ls.stream().map(x->x+5).forEach(System.out::println);
			
	}
}
