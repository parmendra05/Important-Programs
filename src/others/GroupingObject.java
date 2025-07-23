package others;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingObject {
    public static void main(String[] args) {

        ArrayList<Person> personList= new ArrayList<>();
        personList.add(new Person(1,"Raghu","hyderabad"));
        personList.add(new Person(2,"Naresh","hyderabad"));
        personList.add(new Person(3,"Ashok","hyderabad"));
        personList.add(new Person(4,"Sri Nivas","Bangalore"));

       Map<?,?> groupByCity= personList.stream()
               .collect(Collectors.groupingBy(
                       person -> person.getCity(),
                       Collectors.mapping(person -> person.getName(),Collectors.toList()) ));

        System.out.println(groupByCity);
    }
}

class Person{
    private int id;
    private String name;
    private String city;

    public Person(){}

    public Person( int id, String name,String city) {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
