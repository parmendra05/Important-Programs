package important;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		System.out.println("---------- Sorting using Comprator -----------");

		System.out.println("Sorting by Salary");
		SalaryComparator salaryComparator = new SalaryComparator();

		Collections.sort(persons, salaryComparator);
		persons.forEach(System.out::println);

		System.out.println("Sorting by City");
		CityComparator cityComparator = new CityComparator();

		Collections.sort(persons, cityComparator);
		persons.forEach(System.out::println);
	}

}

class SalaryComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		// return Integer.compare(p1.getSalary(), p2.getSalary());
		return p1.getSalary().compareTo(p2.getSalary());
	}

}

class CityComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		return p1.getCity().compareTo(p2.getCity());
	}

}

class Person {
	private String name;
	private Integer salary;
	private String city;

	public Person(String name, Integer salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

}
