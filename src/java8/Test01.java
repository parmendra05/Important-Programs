package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test01 {
    public static void main(String[] args) {

        List<String> elements = Arrays.asList("Banana", "Orange", "Banana", "Apple", "Guava");

//Problem 01: Convert list of string into stream List
        List<String> list1 = elements.stream().collect(Collectors.toList());
        // Note: after java 16 we can write "stream.toList()" instead of writing "stream().collect(Collectors.toList());"
        list1.forEach(System.out::println);
        //"stream.toList()" is unmodifiable return, will throw this exception when we modify the elements UnsupportedOperationException.

//Problem 02: Convert list of string into Set to remove Duplicate
        Set<String> set1 = new HashSet<>(elements);  // Approach 1 , using collection
        Set<String> set2 = elements.stream().collect(Collectors.toSet());  // Approach 2 , using java 8
        // Set<String> set2 = elements.stream().toSet()); : Won't work , toSet() is not present in stream().

        set1.forEach((a) ->  System.out.print(a +", "));

// Problem 03: Convert list of string into map (index -> Value)
        Map<Integer,String> map1 = IntStream.range(0 , elements.size()).boxed()  // boxed() converts the "Integer" into "Stream<Integer>"
                .collect(Collectors.toMap(i -> i , elements::get));

        System.out.println(" \n list of string into map (index -> Value)");
        map1.forEach((k,v) -> System.out.println(k+" : "+v));

 // Problem 04: Convert List to Map (Value -> Length)

        //Map<String,Integer> map2 = elements.stream().collect(Collectors.toMap(value -> value , String::length));
        // java.lang.IllegalStateException: Duplicate key Banana (attempted merging values 6 and 6)

        Map<String,Integer> map3 = new HashSet<>(elements).stream().collect(Collectors.toMap(value -> value , String::length)); // Solution to handle duplicate elements

// Problem 05: Convert List to Map with Custom Value, ex- Map (Value -> CustomValue)
        List<String> list = Arrays.asList("Banana", "Orange", "Apple", "Guava","kiwi");
        Map<String,String> map5 = list.stream().collect(Collectors.toMap(value -> value , String::toUpperCase));
        // String::toUpperCase =  value -> value.toUpperCase();

 // Problem 06: Handle Duplicate Keys with groupingBy, ex- Map (Value -> Occurrence)
        Map<String, Long> map6 = elements.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

// Problem 07: Group Numbers by Remainder when divided by 3
        List<Integer> numbers = Arrays.asList(4,5,6,7,8,9,10,11,12,13);
        Map<Integer, List<Integer>> map7 = numbers.stream().collect(Collectors.groupingBy( n -> n%3));

// Problem 08: Group by String length
        List<String> names = Arrays.asList("Ravi", "Arya" , "Rajesh", "Rani", "Mukesh", "Parmendra");
        Map<Integer , List<String>> map8 = names.stream().collect(Collectors.groupingBy( String::length ));

// Problem 09: Count characters in a string (as Map<Character, Occurrence>)
        String paragraph = "this is paragraph";
        Map<Object , Long> map9 = paragraph.chars()
                .mapToObj( a -> (char)a)
                .filter(a -> a!=' ')
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

// Problem 10: Convert List of Employees to Map<id, name>
        List<Employee> employees = List.of(
               new Employee(9,"Raghu","BLR",50000),
                new Employee(2,"Abhishek","BLR",55000),
                new Employee(7,"Shashi","BLR",57000),
                new Employee(5,"Zakir","BLR",51000)
        );
        Map<Integer , String> map10 = employees.stream().collect(Collectors.toMap(Employee::getId , Employee::getName));

        System.out.println(" \n list of string into map10 (index -> Value)");
        map10.forEach((k,v) -> System.out.println(k+" : "+v));

    }
}
