package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

       // Problem 1: Partition numbers into even and odd
        Map<Boolean , List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(a -> a%2==0));
        System.out.println(evenOddMap);

        //Problem 2: Count even and odd numbers

        Map<Boolean , Long> countEvenOddValue = numbers.stream()
                .collect(Collectors.partitioningBy(a -> a%2==0 , Collectors.counting()));
        System.out.println(countEvenOddValue);

        //Problem 3: Partition words by length > 3
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape","cat", "rat", "dog", "elephant");

        Map<Boolean , List<String>> partitionedWords = words.stream()
                .collect(Collectors.partitioningBy(e -> e.length() > 3 ));
        System.out.println(partitionedWords);

        //Problem 4: Partition strings by starting letter vowel/consonant
        Map<Boolean , List<String>> vowelAndConstWords = words.stream()
                .collect(Collectors.partitioningBy(e -> "AEIOUaeiou".indexOf(e.charAt(0)) >=0));
        System.out.println(vowelAndConstWords);

        //Problem 5: Partition Employees with high/low salary
        List<Employee> employees = List.of(
                new Employee(9,"Raghu","BLR",15000),
                new Employee(2,"Abhishek","BLR",23000),
                new Employee(7,"Shashi","BLR",17000),
                new Employee(5,"Zakir","BLR",51000)
        );
        Map<Boolean , List<Employee>> partitionedEmployees = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 25000 ));
        System.out.println(partitionedEmployees);

        //Problem 6: Count Employees with high/low salary
        Map<Boolean , Long> partitionedEmployeesCount = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 25000, Collectors.counting() ));
        System.out.println(partitionedEmployeesCount);

        //Problem 7: Summarize Employee salaries
        IntSummaryStatistics employeesSummaries = employees.stream()
                .collect(Collectors.summarizingInt(Employee ::getSalary));
        System.out.println(employeesSummaries);

        //Problem 8: Summarize Given Numbers
        IntSummaryStatistics summaries = numbers.stream()
                .collect(Collectors.summarizingInt(Integer ::intValue));
        System.out.println(summaries);
    }
}
