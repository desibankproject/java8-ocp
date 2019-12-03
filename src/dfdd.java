import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String course, name, city;

	public Student(String name, String course, String city) {
		this.course = course;
		this.name = name;
		this.city = city;
	}

	public String getCourse() {
		return course;
	}
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String toString() {
		return course + ":" + name + ":" + city;
	}
}
	public class dfdd {
	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
				new Student ("Helen", "Java EE2", "Houston"),
				new Student ("Helen", "Java EE2", "Houston"),
				new Student ("Helen", "Java EE3", "Houston"),
				new Student ("Helen", "Java EE4", "Houston"),
				new Student ("Helen", "Java EE5", "Houston"),
				new Student ("Jessy", "Java ME6", "Chicago")
				);
				stds.stream().collect(Collectors.groupingBy(Student::getCourse)).forEach((src,res)->System.out.println(src));
	}
}
