package important;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1122, "mark", 35000));
		empList.add(new Employee(1125, "andria", 55000));
		empList.add(new Employee(1055, "vikki", 30000));
		empList.add(new Employee(5214, "joya", 31000));
		empList.add(new Employee(1254, "nyra", 65000));

	}

}

class Employee {
	private Integer id;
	private String name;
	private Integer salaray;

	public Employee(Integer id, String name, Integer salaray) {
		this.id = id;
		this.name = name;
		this.salaray = salaray;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaray=" + salaray + "]";
	}

}
