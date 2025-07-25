package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {

        //Problem 1: Join words with comma
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        String joined1 = words.stream().collect(Collectors.joining(","));
        System.out.println(joined1);

        // Problem 2: Join words with prefix and suffix
        String joined2 = words.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joined2);

        //Problem 3: Count number of elements in a list
       Long count2= words.stream().count();                        // simple , can't use with groupingBy()
        Long count1= words.stream().collect(Collectors.counting());  // can use with groupingBy()
        System.out.println(count1);

        //Problem 4: Sum of integers in a list
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        Integer sum1 = list.stream().mapToInt(a -> a).sum();
        Integer sum2 = list.stream().collect(Collectors.summingInt(a->a));
        Integer sum3 = list.stream().mapToInt(Integer ::intValue).sum();
        System.out.println(", sum1- "+sum1+", sum2- "+sum2+", sum 3- "+sum3);

        //Problem 5: Average of integers in a list
        Double avg1 = list.stream().collect(Collectors.averagingInt(a -> a)); // returns Double Object
        Double avg2 = list.stream().collect(Collectors.averagingInt(Integer::intValue)); // returns Double Object
        System.out.println(", avg- "+avg2);

        //Problem 6: Join employee names with delimiter
        List<Employee> employees = List.of(
                new Employee(9,"Raghu","BLR",50000),
                new Employee(2,"Abhishek","BLR",55000),
                new Employee(7,"Shashi","BLR",57000),
                new Employee(5,"Zakir","BLR",51000)
        );
        String employeeNames = employees.stream().map(Employee::getName)
                .collect(Collectors.joining(","));
        System.out.println(employeeNames);
        
        // Problem 7: Count employees
        Long empCount = employees.stream().count();
        System.out.println("Total Employees :"+empCount);

        //Problem 8: Sum salaries of employees
        Integer sumOfSalaries = employees.stream().map(Employee::getSalary).mapToInt(Integer::intValue).sum();
        Integer sumOfSalaries2 = employees.stream().map(Employee::getSalary).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sumOfSalaries2);

        //Problem 9: Average salary of employees
        Double salariesAvg= employees.stream().map(Employee::getSalary).collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(salariesAvg);

        //Problem 10: Join strings with custom separator and decorations
        List<String> items = Arrays.asList("pen", "pencil", "eraser");
        String customized = items.stream().collect(Collectors.joining(" | ","[ "," ]"));
        System.out.println(customized);
    }
}
