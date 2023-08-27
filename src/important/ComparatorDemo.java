package important;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("mark", 35000, "delhi"));
		persons.add(new Person("andria", 55000, "mumbai"));
		persons.add(new Person("vikki", 30000, "patna"));
		persons.add(new Person("joya", 31000, "hyderabad"));
		persons.add(new Person("nancy", 65000, "delhi"));
		persons.add(new Person("amyra", 39000, "patna"));

		// Printing without sorting
		persons.forEach(System.out::println);

	}

}

class Person {
	private String name;
	private Integer salaray;
	private String city;

	public Person(String name, Integer salaray, String city) {
		super();
		this.name = name;
		this.salaray = salaray;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalaray() {
		return salaray;
	}

	public void setSalaray(Integer salaray) {
		this.salaray = salaray;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salaray=" + salaray + ", city=" + city + "]";
	}

}
